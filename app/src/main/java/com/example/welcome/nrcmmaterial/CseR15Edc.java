package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Edc extends AppCompatActivity {

    public TextView edc1,edc2,edc3,edc4,edc5,edc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_edc);
        edc1=(TextView)findViewById(R.id.edc1);
        edc2=(TextView)findViewById(R.id.edc2);
        edc3=(TextView)findViewById(R.id.edc3);
        edc4=(TextView)findViewById(R.id.edc4);
        edc5=(TextView)findViewById(R.id.edc5);
        edc6=(TextView)findViewById(R.id.edc6);

        edc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Edc.this,EdcUnit1Web.class);
                startActivity(unit1);
            }
        });

        edc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Edc.this,EdcUnit2Web.class);
                startActivity(unit2);
            }
        });
        edc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Edc.this,EdcUnit3Web.class);
                startActivity(unit3);
            }
        });

        edc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Edc.this,EdcUnit4Web.class);
                startActivity(unit4);
            }
        });

        edc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Edc.this,EdcUnit5Web.class);
                startActivity(unit5);
            }
        });

        edc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Edc.this,EdcUnit6Web.class);
                startActivity(unit6);
            }
        });


    }
}
