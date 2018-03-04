package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Ds extends AppCompatActivity {

    public TextView ds1,ds2,ds3,ds4,ds5,ds6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_ds);
        ds1=(TextView)findViewById(R.id.ds1);
        ds2=(TextView)findViewById(R.id.ds2);
        ds3=(TextView)findViewById(R.id.ds3);
        ds4=(TextView)findViewById(R.id.ds4);
        ds5=(TextView)findViewById(R.id.ds5);
        ds6=(TextView)findViewById(R.id.ds6);

        ds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Ds.this,DsUnit1Web.class);
                startActivity(unit1);
            }
        });

        ds2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Ds.this,DsUnit2Web.class);
                startActivity(unit2);
            }
        });
        ds3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Ds.this,DsUnit3Web.class);
                startActivity(unit3);
            }
        });

        ds4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Ds.this,DsUnit4Web.class);
                startActivity(unit4);
            }
        });

        ds5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Ds.this,DsUnit5Web.class);
                startActivity(unit5);
            }
        });

        ds6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Ds.this,DsUnit6Web.class);
                startActivity(unit6);
            }
        });



    }
}
