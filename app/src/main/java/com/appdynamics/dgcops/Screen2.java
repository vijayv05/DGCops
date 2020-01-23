package com.appdynamics.dgcops;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2 extends AbstractScreen {

    public static final String EC = "EC_DETAILS";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        addButtonListener();
    }

    private void addButtonListener() {
        final Context context = this;
        Button btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {


                ECDetails ec = new ECDetails();
                EditText ecName = (EditText)findViewById(R.id.ecName);


                ec.setEcname(ecName.getText().toString());
                ec.setHost(((EditText)findViewById(R.id.ecHostName)).getText().toString());
                ec.setPort(Integer.parseInt(((EditText)findViewById(R.id.ecHostPort)).getText().toString()));
                ec.setUsername(((EditText)findViewById(R.id.ecUsername)).getText().toString());
                ec.setPassword(((EditText)findViewById(R.id.ecPassword)).getText().toString());
                ec.setSSLEnabled(((CheckBox)findViewById(R.id.sslEnabled)).isEnabled());

                StringBuilder sb = new StringBuilder();

                sb.append(ec.getPassword()).append("-").append(ec.getSSLEnabled().toString()).append("-").append(ec.getPort());

                //Toast.makeText(context, sb.toString(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("ECDetails", ec);

                startActivity(intent);


            }

        });

    }




}
