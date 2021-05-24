package com.gratiasdeveloper.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_9_glosarium extends AppCompatActivity {
    ImageView home_imun, back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_9_glosarium);

        home_imun = findViewById(R.id.btnhome);


        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_9_glosarium.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });


    }
}