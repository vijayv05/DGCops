package com.appdynamics.dgcops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        addButtonListener();
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
