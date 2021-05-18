package com.gratiasdeveloper.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class hal_5_menulatihan extends AppCompatActivity {
ImageButton pilgan, essay, tugas, evaluasi, menu_materi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_5_menulatihan);

        pilgan = findViewById(R.id.b_pilgan);
        essay = findViewById(R.id.b_essay);
        tugas = findViewById(R.id.b_tugas);
        evaluasi = findViewById(R.id.b_eval);
        menu_materi = findViewById(R.id.b_menu_materi);

        tugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hal_5_menulatihan.this, tugasmandiri.class);
                startActivity(intent);
                finish();
            }
        });
        pilgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_5_menulatihan.this, hal_6_soalLatihan.class);
                startActivity(intent);

            }
        });

        essay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://gg.gg/Essay-E-modul-Sistem-Pertahanan-Tubuh-Kelas-XI");
                //String uri = " http://gg.gg/Essay-E-modul-Sistem-Pertahanan-Tubuh-Kelas-XI";
                Intent essay = new Intent(Intent.ACTION_VIEW);
                essay.setData(uri);
                startActivity(essay);
            }
        });

        evaluasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSf-B1T735vvR1vxs1Hj7dEhMlZYyIHA4jNKBd2ftIUNUwZHnA/viewform");
                Intent essay = new Intent(Intent.ACTION_VIEW);
                essay.setData(uri);
                startActivity(essay);
            }
        });
        menu_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_5_menulatihan.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}