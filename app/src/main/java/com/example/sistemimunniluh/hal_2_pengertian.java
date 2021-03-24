package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_pengertian extends AppCompatActivity {

    ImageView home_imun, menu_materi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_pengertian);

        home_imun = findViewById(R.id.btnhome);
        menu_materi = findViewById(R.id.btnhome22);

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_pengertian.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });

        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_pengertian.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}