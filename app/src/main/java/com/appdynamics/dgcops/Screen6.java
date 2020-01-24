package com.appdynamics.dgcops;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Screen6 extends AppCompatActivity {

    NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen6);

            notificationManager =
                    (NotificationManager)
                            getSystemService(Context.NOTIFICATION_SERVICE);

            createNotificationChannel(
                    "Controller Down",
                    "controller_down",
                    "Controller");
        }

        protected void createNotificationChannel(String id, String name, String description) {

            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel =
                    new NotificationChannel(id, name, importance);

            channel.setDescription(description);
            channel.enableLights(true);
            channel.setLightColor(Color.RED);
            channel.enableVibration(true);
            channel.setVibrationPattern(
                    new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            notificationManager.createNotificationChannel(channel);
        }

        public void sendNotification(View view) {

        int notificationID = 101;
        String channelID = "Controller Down";

            Intent resultIntent = new Intent(this, Screen6a.class);

            PendingIntent pendingIntent =
                    PendingIntent.getActivity(
                            this,
                            0,
                            resultIntent,
                            PendingIntent.FLAG_UPDATE_CURRENT
                    );
        final Icon icon = Icon.createWithResource(Screen6.this,
                android.R.drawable.ic_dialog_info);

        Notification.Action action =
                new Notification.Action.Builder(icon, "Open", pendingIntent)
                        .build();

        Notification notification =
                new Notification.Builder(Screen6.this,
                        channelID)
                        .setContentTitle("Controller Critical")
                        .setContentText("Open notification for more details")
                        .setSmallIcon(R.drawable.appd_invert_2)
                        .setChannelId(channelID)
                        .setContentIntent(pendingIntent)
                        .setActions(action)
                        .build();

        notificationManager.notify(notificationID, notification);
    }

    }
