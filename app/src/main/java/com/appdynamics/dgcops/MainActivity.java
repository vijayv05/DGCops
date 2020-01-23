package com.appdynamics.dgcops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.appdynamics.dgcops.utils.Utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AbstractScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Context context = this;
        ArrayList<ECDetails> ecList = new ArrayList<>();
        Intent intent = getIntent();

        if(context.getCacheDir().listFiles().length == 0 && intent.getSerializableExtra("ECDetails") == null){
            setContentView(R.layout.screen1);
            addButtonListener();
        } else {


            if (intent.getSerializableExtra("ECDetails") != null) {
                ECDetails ec = (ECDetails) intent.getSerializableExtra("ECDetails");
                try {
                    Utility.writeObj(context.getCacheDir().getAbsolutePath()+File.separator+ec.getEcname()+".ser", ec);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            File[] files = context.getCacheDir().listFiles();

            for(int i = 0; i < files.length ; i++) {
                try {
                    ecList.add(Utility.readObject(files[i].getAbsolutePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

            Intent intent3 = new Intent(context, Screen3.class);
            intent3.putExtra("ECDeatilsList", ecList);

            startActivity(intent3);
        }



        // check cache



    }

    private void addButtonListener() {
        final Context context = this;
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                try {
                    context.startActivity(new Intent(context, Screen2.class));
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }

        });

    }


}
