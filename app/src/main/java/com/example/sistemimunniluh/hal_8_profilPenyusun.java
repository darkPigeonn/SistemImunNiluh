package com.example.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hal_8_profilPenyusun extends AppCompatActivity {
Button menu_profil;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_8_profil_penyusun);
        menu_profil = findViewById(R.id.b_profil);

        menu_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_8_profilPenyusun.this, hal_8_profilPenyusun.class);
                startActivity(intent);
                finish();
            }
        });
    }
}