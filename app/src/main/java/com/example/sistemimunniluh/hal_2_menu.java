package com.example.sistemimunniluh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_menu extends AppCompatActivity {
    //initialisai button ;
    Button kataPengantar,ki_kd,arsepsi,petunjuk_penggunaan,s_imun,tujuan_pembelajaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_menu);

        //menghubungkan button initialsiasi dengan button di design
        kataPengantar.findViewById(R.id.b_kp);



        //membuat aksi ketika button di klik
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
    }
}