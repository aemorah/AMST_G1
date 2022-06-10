package com.example.amst_g1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class video_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        //YouTubePlayerView youtubeVideo = findViewById(R.id.videoYoutube);
        //getLifecycle().addObserver(youtubeVideo);
    }
    public void regresar(View view) {
        Intent intent = new Intent(this, menu_ingreso.class);
        startActivity(intent);
    }
}