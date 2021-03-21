package com.example.sistemimunniluh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_4_menu3 extends AppCompatActivity {
Button penguatan_karakter, video, gambar, menu_vid_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_4_menu3);

        video.findViewById(R.id.b_video);
        gambar.findViewById(R.id.b_gambar);
        menu_vid_img.findViewById(R.id.b_menu_vid_img);

video.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(hal_4_menu3.this,hal_4_menu3_video.class);
        startActivity(intent);
        finish();
    }
});

gambar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(hal_4_menu3.this,hal_4_menu3_gambar.class);
        startActivity(intent);
        finish();
    }
});

        menu_vid_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_4_menu3.this, hal_4_menu3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}