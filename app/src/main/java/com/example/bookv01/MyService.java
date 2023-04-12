package com.example.bookv01;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public  MyService(){
    }

    private MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this,R.raw.reveries);
        Toast.makeText(this, "chillin'...", Toast.LENGTH_SHORT).show();

    }

    public int onStartCommand(Intent intent, int flags, int startId) {

        if (!player.isPlaying())

            player.start();
        return START_STICKY;
    }

    public void onDestroy() {
        super.onDestroy();
        if(player.isPlaying()){
            player.stop();
            player.release();
        }
        Toast.makeText(this, "Not your type?", Toast.LENGTH_SHORT).show();
    }
}