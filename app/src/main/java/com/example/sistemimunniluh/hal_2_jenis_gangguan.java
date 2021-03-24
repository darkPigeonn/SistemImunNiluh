package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_jenis_gangguan extends AppCompatActivity {
    ImageView home_imun, menu_materi;
    ImageButton jenis, gangguan;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_jenis_gangguan);

        home_imun = findViewById(R.id.btnhome);
        menu_materi = findViewById(R.id.btnhome2);

        jenis = findViewById(R.id.b_jenis);
        gangguan = findViewById(R.id.b_gangguan);

        gangguan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_jenis_gangguan.this, hal_2_gangguan_imun.class);
                startActivity(intent);
                finish();
            }
        });
        jenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_jenis_gangguan.this, hal_2_jenis_imun.class);
                startActivity(intent);
                finish();
            }
        });
        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_jenis_gangguan.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });

        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_jenis_gangguan.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}