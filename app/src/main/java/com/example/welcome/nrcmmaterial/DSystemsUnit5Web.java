package com.example.welcome.nrcmmaterial;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class DSystemsUnit5Web extends AppCompatActivity {

    WebView webView;
    ProgressBar bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsystems_unit5_web);

        webView=(WebView)findViewById(R.id.webView) ;
        bar=(ProgressBar)findViewById(R.id.progressBar2);
        webView.loadUrl("https://drive.google.com/open?id=113VKp7x-xvhUz0A6sHwjfGO-QwjHGvnU");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new DSystemsUnit5Web.myWebclient());
    }
    public class myWebclient extends WebViewClient{
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            bar.setVisibility(View.GONE);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
