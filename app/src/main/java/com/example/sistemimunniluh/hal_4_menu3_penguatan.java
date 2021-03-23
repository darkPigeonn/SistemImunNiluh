package com.example.sistemimunniluh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hal_4_menu3_penguatan extends AppCompatActivity {

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
                Intent intent = new Intent(hal_4_menu3_penguatan.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });


    }
}