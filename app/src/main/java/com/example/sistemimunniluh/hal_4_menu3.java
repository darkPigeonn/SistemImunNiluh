package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_4_menu3 extends AppCompatActivity {
ImageButton penguatan_karakter, video, gambar, menu_vid_img;
ImageView glosarium,daftar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_4_menu3);

        penguatan_karakter = findViewById(R.id.b_penguatan);
        video = findViewById(R.id.b_video);
        gambar = findViewById(R.id.b_gambar);
        menu_vid_img = findViewById(R.id.b_menu_vid_img);

        glosarium = findViewById(R.id.btnglosa);
        daftar = findViewById(R.id.btndaftar_pustaka);

        glosarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hal_4_menu3.this,hal_9_glosarium.class);
                startActivity(intent);
                finish();
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hal_4_menu3.this,hal_10_daftarPustaka.class);
                startActivity(intent);
                finish();
            }
        });
        penguatan_karakter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_4_menu3.this,hal_4_menu3_penguatan.class);
                startActivity(intent);
                finish();
            }
        });
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
                Intent intent = new Intent(hal_4_menu3.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}