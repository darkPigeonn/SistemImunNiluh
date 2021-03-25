package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_10_daftarPustaka extends AppCompatActivity {
    ImageView home_imun,back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_10_daftar_pustaka);

        home_imun = findViewById(R.id.btnhome);
        back = findViewById(R.id.btnback);

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_10_daftarPustaka.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_10_daftarPustaka.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });



    }
}