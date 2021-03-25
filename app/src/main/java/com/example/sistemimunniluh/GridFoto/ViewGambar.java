package com.example.sistemimunniluh.GridFoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sistemimunniluh.R;

import java.util.ArrayList;

public class ViewGambar extends AppCompatActivity {
    private ArrayList<Foto> listFoto = new ArrayList<>();
    private ScaleGestureDetector mScaleGestureDetector;
    private float mScaleFactor = 1.0f;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_gambar);

       int posisi = this.getIntent().getExtras().getInt("position");
       listFoto.addAll(DataForo.getListData());


        Foto foto = listFoto.get(posisi);

        iv = findViewById(R.id.viewImage);
        TextView tv = findViewById(R.id.detailteks);

        tv.setText(foto.getName());
        int getImage = foto.getPhoto();
        iv.setImageResource(getImage);

        mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mScaleGestureDetector.onTouchEvent(event);
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        // when a scale gesture is detected, use it to resize the image
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector){
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            iv.setScaleX(mScaleFactor);
            iv.setScaleY(mScaleFactor);
            return true;
        }
    }
}