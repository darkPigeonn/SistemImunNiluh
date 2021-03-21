package com.example.sistemimunniluh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_4_menu3_video extends AppCompatActivity {
    Button home_imun, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2_kp);

        home_imun.findViewById(R.id.btnhome);
        back.findViewById(R.id.btnbck);

        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_4_menu3_video.this, hal_3_menu2.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_4_menu3_video.this, hal_4_menu3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}