package com.example.sistemimunniluh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_mekanisme extends AppCompatActivity {
Button pertahanan_adaptif, pertahanan_alamiah, home_imun, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_mekanisme);

        pertahanan_adaptif.findViewById(R.id.b_adaptif);
        pertahanan_alamiah.findViewById(R.id.b_alami);
        home_imun.findViewById(R.id.btnhome);
        back.findViewById(R.id.btnbck);

        pertahanan_adaptif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this,hal_2_mekanisme_adaptif.class);
                startActivity(intent);
                finish();
            }
        });

        pertahanan_alamiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this, hal_2_mekanisme_alami.class);
                startActivity(intent);
                finish();
            }
        });

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_mekanisme.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}