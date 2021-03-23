package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class hal_5_menulatihan extends AppCompatActivity {
ImageButton pilgan, essay, tugas, evaluasi, menu_materi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_5_menulatihan);

        pilgan = findViewById(R.id.b_pilgan);
        essay = findViewById(R.id.b_essay);
        tugas = findViewById(R.id.b_tugas);
        evaluasi = findViewById(R.id.b_eval);
        menu_materi = findViewById(R.id.b_menu_materi);

        pilgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_5_menulatihan.this, hal_6_soalLatihan.class);
                startActivity(intent);
                finish();
            }
        });

        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_5_menulatihan.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}