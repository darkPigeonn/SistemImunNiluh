package com.example.sistemimunniluh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hal_4_menu3_penguatan extends AppCompatActivity {

    Button home_imun, back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2_kp);

        home_imun = findViewById(R.id.btnhome);
        back = findViewById(R.id.btnbck);

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_4_menu3_penguatan.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_4_menu3_penguatan.this, hal_4_menu3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}