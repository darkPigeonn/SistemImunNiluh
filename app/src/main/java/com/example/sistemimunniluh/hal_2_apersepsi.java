package com.example.sistemimunniluh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class hal_2_apersepsi extends AppCompatActivity {

    ImageView back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_apersepsi);


        back = findViewById(R.id.btnbck);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_apersepsi.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}