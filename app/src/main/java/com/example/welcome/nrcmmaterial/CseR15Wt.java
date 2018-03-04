package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Wt extends AppCompatActivity {

    public TextView wt1,wt2,wt3,wt4,wt5,wt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_wt);
        wt1=(TextView)findViewById(R.id.wt1);
        wt2=(TextView)findViewById(R.id.wt2);
        wt3=(TextView)findViewById(R.id.wt3);
        wt4=(TextView)findViewById(R.id.wt4);
        wt5=(TextView)findViewById(R.id.wt5);
        wt6=(TextView)findViewById(R.id.wt6);

        wt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Wt.this,WtUnit1Web.class);
                startActivity(unit1);
            }
        });

        wt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Wt.this,WtUnit2Web.class);
                startActivity(unit2);
            }
        });
        wt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Wt.this,WtUnit3Web.class);
                startActivity(unit3);
            }
        });

        wt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Wt.this,WtUnit4Web.class);
                startActivity(unit4);
            }
        });

        wt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Wt.this,WtUnit5Web.class);
                startActivity(unit5);
            }
        });

        wt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Wt.this,WtUnit6Web.class);
                startActivity(unit6);
            }
        });

    }
}
