package com.gratiasdeveloper.sistemimunniluh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hal_4_menu3_penguatan extends AppCompatActivity {

    ImageView home_imun,back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_4_menu3_penguatan);

        home_imun = findViewById(R.id.btnhome);
        back = findViewById(R.id.btnbck);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hal_4_menu3_penguatan.this, hal_4_menu3.class);
                startActivity(intent);
                finish();
            }
        });

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