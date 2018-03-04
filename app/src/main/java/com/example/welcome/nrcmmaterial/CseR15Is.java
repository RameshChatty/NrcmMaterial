package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Is extends AppCompatActivity {

    public TextView is1,is2,is3,is4,is5,is6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_is);
        is1=(TextView)findViewById(R.id.is1);
        is2=(TextView)findViewById(R.id.is2);
        is3=(TextView)findViewById(R.id.is3);
        is4=(TextView)findViewById(R.id.is4);
        is5=(TextView)findViewById(R.id.is5);
        is6=(TextView)findViewById(R.id.is6);

        is1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Is.this,IsUnit1Web.class);
                startActivity(unit1);
            }
        });

        is2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Is.this,IsUnit2Web.class);
                startActivity(unit2);
            }
        });
        is3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Is.this,IsUnit3Web.class);
                startActivity(unit3);
            }
        });

        is4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Is.this,IsUnit4Web.class);
                startActivity(unit4);
            }
        });

        is5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Is.this,IsUnit5Web.class);
                startActivity(unit5);
            }
        });

        is6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Is.this,IsUnit6Web.class);
                startActivity(unit6);
            }
        });



    }
}
