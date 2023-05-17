package com.example.notification;

import android.app.Application;
import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    public static final String CHANEL_1_ID = "chanel1";
    public static final String CHANEL_2_ID = "chanel2";

    @Override
    public void onCreate() {
        super.onCreate();
        creteNotivicationChannels();
    }
    private void creteNotivicationChannels(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel Channel1 = new NotificationChannel(
                    CHANEL_1_ID,
                    "Chanel 1",
                    NotificationManager.IMPORTANCE_HIGH
            );
            Channel1.setDescription("this is chanel 1");

            NotificationChannel Channel2 = new NotificationChannel(
                    CHANEL_2_ID,
                    "Chanel 2",
                    NotificationManager.IMPORTANCE_LOW
            );
            Channel2.setDescription("this is chanel 2");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(Channel1);
            manager.createNotificationChannel(Channel2);
        }
    }
}
