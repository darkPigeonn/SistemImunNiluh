package com.gratiasdeveloper.sistemimunniluh.pilgan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gratiasdeveloper.sistemimunniluh.R;
import com.gratiasdeveloper.sistemimunniluh.hal_6_soalLatihan;

public class HasilKuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :"+ hal_6_soalLatihan.benar+"\nJawaban Salah :"+hal_6_soalLatihan.salah);
        nilai.setText(""+hal_6_soalLatihan.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),hal_6_soalLatihan.class);
        startActivity(a);
    }
}