package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class CseR15Cp extends AppCompatActivity {
    public TextView cp1,cp2,cp3,cp4,cp5,cp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_cp);
        cp1=(TextView)findViewById(R.id.cp1);
        cp2=(TextView)findViewById(R.id.cp2);
        cp3=(TextView)findViewById(R.id.cp3);
        cp4=(TextView)findViewById(R.id.cp4);
        cp5=(TextView)findViewById(R.id.cp5);
        cp6=(TextView)findViewById(R.id.cp6);

        cp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Cp.this,CpUnit1Web.class);
                startActivity(unit1);
            }
        });

        cp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Cp.this,CpUnit2Web.class);
                startActivity(unit2);
            }
        });
        cp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Cp.this,CpUnit3Web.class);
                startActivity(unit3);
            }
        });

        cp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Cp.this,CpUnit4Web.class);
                startActivity(unit4);
            }
        });

        cp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Cp.this,CpUnit5Web.class);
                startActivity(unit5);
            }
        });

        cp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Cp.this,CpUnit6Web.class);
                startActivity(unit6);
            }
        });






    }
}
