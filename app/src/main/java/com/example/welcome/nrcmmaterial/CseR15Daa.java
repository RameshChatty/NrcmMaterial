package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Daa extends AppCompatActivity {

    public TextView daa1,daa2,daa3,daa4,daa5,daa6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_daa);
        daa1=(TextView)findViewById(R.id.daa1);
        daa2=(TextView)findViewById(R.id.daa2);
        daa3=(TextView)findViewById(R.id.daa3);
        daa4=(TextView)findViewById(R.id.daa4);
        daa5=(TextView)findViewById(R.id.daa5);
        daa6=(TextView)findViewById(R.id.daa6);

        daa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Daa.this,DaaUnit1Web.class);
                startActivity(unit1);
            }
        });

        daa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Daa.this,DaaUnit2Web.class);
                startActivity(unit2);
            }
        });
        daa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Daa.this,DaaUnit3Web.class);
                startActivity(unit3);
            }
        });

        daa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Daa.this,DaaUnit4Web.class);
                startActivity(unit4);
            }
        });

        daa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Daa.this,DaaUnit5Web.class);
                startActivity(unit5);
            }
        });

        daa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Daa.this,DaaUnit6Web.class);
                startActivity(unit6);
            }
        });


    }
}
