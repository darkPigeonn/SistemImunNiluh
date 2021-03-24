package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_mekanisme extends AppCompatActivity {
ImageButton pertahanan_adaptif, pertahanan_alamiah;
ImageView home_imun, menu_materi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_mekanisme);

        pertahanan_adaptif = findViewById(R.id.b_adaptif);
        pertahanan_alamiah = findViewById(R.id.b_alami);
        home_imun = findViewById(R.id.btnhome);
        menu_materi = findViewById(R.id.btnhome2);

        pertahanan_adaptif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this,hal_2_mekanisme_adaptif.class);
                startActivity(intent);
                finish();
            }
        });

        pertahanan_alamiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this, hal_2_mekanisme_alami.class);
                startActivity(intent);
                finish();
            }
        });

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });

        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}