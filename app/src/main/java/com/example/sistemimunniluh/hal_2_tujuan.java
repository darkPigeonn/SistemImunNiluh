package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_tujuan extends AppCompatActivity {
    ImageView back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_tujuan);


        back = findViewById(R.id.btnbck);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_tujuan.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}