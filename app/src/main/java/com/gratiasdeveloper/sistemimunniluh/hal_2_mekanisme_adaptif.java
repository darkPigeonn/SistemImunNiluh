package com.gratiasdeveloper.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_mekanisme_adaptif extends AppCompatActivity {

    ImageView home_imun, menu_materi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_mekanisme_adaptif);

        home_imun = findViewById(R.id.btnhome);

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme_adaptif.this, hal_2_mekanisme.class);
                startActivity(intent);
                finish();
            }
        });
    }
}