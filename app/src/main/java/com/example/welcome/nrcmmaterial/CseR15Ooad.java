package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Ooad extends AppCompatActivity {

    public TextView ooad1,ooad2,ooad3,ooad4,ooad5,ooad6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_ooad);
        ooad1=(TextView)findViewById(R.id.ooad1);
        ooad2=(TextView)findViewById(R.id.ooad2);
        ooad3=(TextView)findViewById(R.id.ooad3);
        ooad4=(TextView)findViewById(R.id.ooad4);
        ooad5=(TextView)findViewById(R.id.ooad5);
        ooad6=(TextView)findViewById(R.id.ooad6);

        ooad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Ooad.this,OoadUnit1Web.class);
                startActivity(unit1);
            }
        });

        ooad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Ooad.this,OoadUnit2Web.class);
                startActivity(unit2);
            }
        });
        ooad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Ooad.this,OoadUnit3Web.class);
                startActivity(unit3);
            }
        });

        ooad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Ooad.this,OoadUnit4Web.class);
                startActivity(unit4);
            }
        });

        ooad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Ooad.this,OoadUnit5Web.class);
                startActivity(unit5);
            }
        });

        ooad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Ooad.this,OoadUnit6Web.class);
                startActivity(unit6);
            }
        });






    }
}
