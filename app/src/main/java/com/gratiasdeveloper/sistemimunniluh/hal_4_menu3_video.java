package com.gratiasdeveloper.sistemimunniluh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hal_4_menu3_video extends AppCompatActivity {
    ImageView home_imun, back;
    Button btn1,btn2,btn3,bnt4,btn5,btn6,btn7,btn8,btn9;
    WebView webViewSaya;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_4_menu3_video);

        home_imun = findViewById(R.id.btnhome);
        back = findViewById(R.id.btnbck);
        webViewSaya = findViewById(R.id.webViewSaya);

        // setting
        webViewSaya.setWebViewClient(new WebViewClient());
        webViewSaya.setWebChromeClient(new WebChromeClient());
        webViewSaya.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewSaya.getSettings().setJavaScriptEnabled(true);
        webViewSaya.getSettings().setPluginState(WebSettings.PluginState.ON);
        webViewSaya.getSettings().setDefaultFontSize(18);

        //
        home_imun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hal_4_menu3_video.this, hal_2_menu.class);
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
    private void muatVideo(String kode_youtube) {
        String kodeHTML = "<head></head><body>" +
                "<iframe width=\"400\" height=\"315\" src=\"https://www.youtube.com/embed/" +
                kode_youtube +
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>" +
                "</body>";
        webViewSaya.loadData(kodeHTML,"text/html; charset=utf-8",null);
    }
    public void Video1(View view) {
        muatVideo("48H59dwQO8Y");
    }
    public void Video2(View view) {
        muatVideo("PzunOgYHeyg");
    }
    public void Video3(View view) {
        muatVideo("B-0Ryg_hvHk");
    }public void Video4(View view) {
        muatVideo("Q3yX49JRaks");
    }
    public void Video5(View view) {
        muatVideo("alO_csFxHhQ");
    }
    public void Video6(View view) {
        muatVideo("C0FDq5gdGls");
    }public void Video7(View view) {
        muatVideo("xqWeCXiLHnc");
    }
    public void Video8(View view) {
        muatVideo("ftNCj06d7KE");
    }
    public void Video9(View view) {
        muatVideo("IdWx4hC375Y");
    }

}