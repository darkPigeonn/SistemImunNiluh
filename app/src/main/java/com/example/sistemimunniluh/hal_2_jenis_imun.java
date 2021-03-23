package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_jenis_imun extends AppCompatActivity {

    Button home_imun, menu_materi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_jenis_imun);

        home_imun = findViewById(R.id.btnhome);
        menu_materi.findViewById(R.id.b_menu_materi);

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_jenis_imun.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });

        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_jenis_imun.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}