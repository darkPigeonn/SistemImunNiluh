package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_gangguan_imun extends AppCompatActivity {

    Button menu_materi, back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_gangguan_imun);

        menu_materi = findViewById(R.id.b_menu_materi);
        back = findViewById(R.id.btnbck);

        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_gangguan_imun.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_gangguan_imun.this, hal_2_jenis_gangguan.class);
                startActivity(intent);
                finish();
            }
        });
    }
}