package com.gratiasdeveloper.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_2_petunjuk extends AppCompatActivity {
    ImageView back;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_2_petunjuk);

        back = findViewById(R.id.btnbck);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_2_petunjuk.this, hal_2_menu.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void tombol1(View view) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14k-wxzbcuRofSeHCk4vPMIHgyejxDJvg/view?usp=drive_web"));
        startActivity(implicit);
    }
}