package com.appdynamics.dgcops;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.appdynamics.dgcops.controller.APIController;
import com.appdynamics.dgcops.model.Platform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Screen5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        List<Platform> platforms = null;
        super.onCreate(savedInstanceState);
        try {

            int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET);
            if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Shaata", Toast.LENGTH_SHORT).show();
                platforms = APIController.executeGET("http://server1:9191/service/platforms");
                System.out.println(platforms);
                Toast.makeText(this, platforms.get(0).getName(), Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.INTERNET}, 0);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


        setContentView(R.layout.screen5);





    }




}
