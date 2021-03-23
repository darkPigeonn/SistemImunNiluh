package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_10_daftarPustaka extends AppCompatActivity {
    Button home_imun;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2_kp);

        home_imun = findViewById(R.id.btnhome);


        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_10_daftarPustaka.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });


    }
}