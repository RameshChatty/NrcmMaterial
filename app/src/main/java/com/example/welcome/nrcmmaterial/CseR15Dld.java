package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Dld extends AppCompatActivity {
    public TextView dld1,dld2,dld3,dld4,dld5,dld6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_dld);
        dld1=(TextView)findViewById(R.id.dld1);
        dld2=(TextView)findViewById(R.id.dld2);
        dld3=(TextView)findViewById(R.id.dld3);
        dld4=(TextView)findViewById(R.id.dld4);
        dld5=(TextView)findViewById(R.id.dld5);
        dld6=(TextView)findViewById(R.id.dld6);

        dld1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Dld.this,DldUnit1Web.class);
                startActivity(unit1);
            }
        });

        dld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Dld.this,DldUnit2Web.class);
                startActivity(unit2);
            }
        });
        dld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Dld.this,DldUnit3Web.class);
                startActivity(unit3);
            }
        });

        dld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Dld.this,DldUnit4Web.class);
                startActivity(unit4);
            }
        });

        dld5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Dld.this,DldUnit5Web.class);
                startActivity(unit5);
            }
        });

        dld6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Dld.this,DldUnit6Web.class);
                startActivity(unit6);
            }
        });




    }
}
