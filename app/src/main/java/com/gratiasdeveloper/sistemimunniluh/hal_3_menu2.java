package com.gratiasdeveloper.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_3_menu2 extends AppCompatActivity {
ImageButton pengertian_fungsi, mekanisme_imun, faktor_imun, jenis_gangguan_imun, home;
ImageView glosarium, daftar_pustaka;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_3_menu2);

        home = findViewById(R.id.b_main_home);
        pengertian_fungsi = findViewById(R.id.b_pengertian);
        mekanisme_imun = findViewById(R.id.b_mekanisme);
        faktor_imun = findViewById(R.id.b_faktor);
        jenis_gangguan_imun = findViewById(R.id.b_jenisimun);

        glosarium = findViewById(R.id.btnglosa);
        daftar_pustaka = findViewById(R.id.btndaftar_pustaka);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_3_menu2.this,hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });
        pengertian_fungsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_3_menu2.this,hal_2_pengertian.class);
                startActivity(intent);
                finish();
            }
        });

        mekanisme_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_3_menu2.this,hal_2_mekanisme.class);
                startActivity(intent);
                finish();
            }
        });

        faktor_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_3_menu2.this, hal_2_faktor.class);
                startActivity(intent);
                finish();
            }
        });

        jenis_gangguan_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_3_menu2.this, hal_2_jenis_gangguan.class);
                startActivity(intent);
                finish();
            }
        });



        glosarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_3_menu2.this, hal_9_glosarium.class);
                startActivity(intent);
                finish();
            }
        });

        daftar_pustaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_3_menu2.this, hal_10_daftarPustaka.class);
                startActivity(intent);
                finish();
            }
        });
    }
}