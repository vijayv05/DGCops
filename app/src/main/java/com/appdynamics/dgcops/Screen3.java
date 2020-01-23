package com.appdynamics.dgcops;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final Context context = this;
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        ArrayList<ECDetails> ec = (ArrayList<ECDetails>) intent.getSerializableExtra("ECDeatilsList");

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < ec.size() ; i++) {
            String ecName = ec.get(i).getEcname();

            TextView tv = new TextView(this);
            tv.setText(ecName);
            tv.setTextSize(24);
            tv.setClickable(true);

            tv.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Intent intent = new Intent(context, Screen5.class);
                    intent.putExtra("ECName", "ecname");
                    startActivity(intent);
                }
            });

            ll.addView(tv);

        }
//        String[] textArray={"one","two","asdasasdf asdf dsdaa"};
//        int length=textArray.length;
//        RelativeLayout layout = new RelativeLayout(this);
//        RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams(
//                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//        for(int i=0;i<length;i++){
//            TextView tv=new TextView(getApplicationContext());
//            tv.setText(textArray[i]);
//            relativeParams.addRule(RelativeLayout.BELOW, tv.getId());
//            layout.addView(tv, relativeParams);
//        }

        setContentView(ll);


    }




}
