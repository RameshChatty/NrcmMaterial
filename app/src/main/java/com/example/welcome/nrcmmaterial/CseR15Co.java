package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Co extends AppCompatActivity {
    public TextView co1,co2,co3,co4,co5,co6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_co);
        co1=(TextView)findViewById(R.id.co1);
        co2=(TextView)findViewById(R.id.co2);
        co3=(TextView)findViewById(R.id.co3);
        co4=(TextView)findViewById(R.id.co4);
        co5=(TextView)findViewById(R.id.co5);
        co6=(TextView)findViewById(R.id.co6);

        co1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Co.this,CoUnit1Web.class);
                startActivity(unit1);
            }
        });

        co2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Co.this,CoUnit2Web.class);
                startActivity(unit2);
            }
        });
        co3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Co.this,CoUnit3Web.class);
                startActivity(unit3);
            }
        });

        co4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Co.this,CoUnit4Web.class);
                startActivity(unit4);
            }
        });

        co5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Co.this,CoUnit5Web.class);
                startActivity(unit5);
            }
        });

        co6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Co.this,CoUnit6Web.class);
                startActivity(unit6);
            }
        });





    }
}
