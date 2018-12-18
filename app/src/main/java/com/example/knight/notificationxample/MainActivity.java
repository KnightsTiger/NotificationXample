package com.example.knight.notificationxample;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNotificaitons(View view) {
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);

        NotificationCompat.Builder  builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("This is the title");
        builder.setContentInfo("This is the information");
        builder.setSmallIcon(R.drawable.ic_launcher_background);

        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,1,intent,0);
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);

        notificationManagerCompat.notify(1,builder.build());
        finish();
    }
}
