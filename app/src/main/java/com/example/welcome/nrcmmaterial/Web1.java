package com.example.welcome.nrcmmaterial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);
        String Url="https://drive.google.com/file/d/1I2n4bX2duc9Didt1Go-PrXFQ2AipXecr/view?usp=sharing";

        WebView web = (WebView)findViewById(R.id.webView);
        web.loadUrl(Url);

    }
}
