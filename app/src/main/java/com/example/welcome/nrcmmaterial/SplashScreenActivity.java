package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView imgSplashScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imgSplashScreen = (ImageView)findViewById(R.id.imgSplashScreen);

        Thread thread = new Thread(){

            public void run(){
                try {
                    sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreenActivity.this,BranchesListActivity.class));
                }
            }
        };
        thread.start();


    }
}
