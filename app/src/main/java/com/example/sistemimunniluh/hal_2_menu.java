package com.example.sistemimunniluh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_menu extends AppCompatActivity {
    //initialisai button ;
    ImageButton kataPengantar,ki_kd,arsepsi,petunjuk_penggunaan,s_imun,tujuan_pembelajaran, menu_vid_img, menu_materi, menu_latihan, menu_profil, menu_utama
            ,b1chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_menu);

        //menghubungkan button initialsiasi dengan button di design
        kataPengantar = findViewById(R.id.b_kp);
        ki_kd =findViewById(R.id.b_kikd);
        arsepsi =findViewById(R.id.b_aper);
        petunjuk_penggunaan = findViewById(R.id.b_petunjuk);
        s_imun = findViewById(R.id.b_simun);
        tujuan_pembelajaran = findViewById(R.id.b_tp);
        menu_vid_img = findViewById(R.id.b_menu_vid_img);
        menu_materi = findViewById(R.id.b_menu_materi);
        menu_latihan = findViewById(R.id.b_menu_latihan);
        menu_profil = findViewById(R.id.b_profil);
        menu_utama = findViewById(R.id.b_main_home);
        b1chat = findViewById(R.id.b1chat);

       // membuat aksi ketika button di klik
        kataPengantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi untuk berpindah aktivity atau tampilan
                Intent intent = new Intent(hal_2_menu.this,hal2_kp.class);
                //memulai aktiviti
                startActivity(intent);
                finish();
            }
        });

        ki_kd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this,hal_2_kikd.class);
                startActivity(intent);
                finish();
            }
        });

        //bagian apersepsi belum ada
        petunjuk_penggunaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this,hal_2_petunjuk.class);
                startActivity(intent);
                finish();
            }
        });

        s_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });

        tujuan_pembelajaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this, hal_2_tujuan.class);
                startActivity(intent);
                finish();
            }
        });

        menu_vid_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this, hal_4_menu3.class);
                startActivity(intent);
                finish();
            }
        });

        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });

        menu_latihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this, hal_5_menulatihan.class);
                startActivity(intent);
                finish();
            }
        });

        menu_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this, hal_8_profilPenyusun.class);
                startActivity(intent);
                finish();
            }
        });

        menu_utama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_menu.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}