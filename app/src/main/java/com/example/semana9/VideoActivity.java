package com.example.semana9;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);  // Vincula al segundo XML (activity_video.xml)

        videoView = findViewById(R.id.VideoView);

        // Obtener el URI del video que pasamos desde la actividad principal
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(videoUri);

        // Iniciar el video automáticamente cuando se cargue la actividad
        videoView.start();
    }
}
