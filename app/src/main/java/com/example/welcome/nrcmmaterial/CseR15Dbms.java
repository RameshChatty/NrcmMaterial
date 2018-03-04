package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Dbms extends AppCompatActivity {

    public TextView dbms1,dbms2,dbms3,dbms4,dbms5,dbms6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_dbms);
        dbms1=(TextView)findViewById(R.id.dbms1);
        dbms2=(TextView)findViewById(R.id.dbms2);
        dbms3=(TextView)findViewById(R.id.dbms3);
        dbms4=(TextView)findViewById(R.id.dbms4);
        dbms5=(TextView)findViewById(R.id.dbms5);
        dbms6=(TextView)findViewById(R.id.dbms6);

        dbms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Dbms.this,DbmsUnit1Web.class);
                startActivity(unit1);
            }
        });

        dbms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Dbms.this,DbmsUnit2Web.class);
                startActivity(unit2);
            }
        });
        dbms3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Dbms.this,DbmsUnit3Web.class);
                startActivity(unit3);
            }
        });

        dbms4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Dbms.this,DbmsUnit4Web.class);
                startActivity(unit4);
            }
        });

        dbms5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Dbms.this,DbmsUnit5Web.class);
                startActivity(unit5);
            }
        });

        dbms6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Dbms.this,DbmsUnit6Web.class);
                startActivity(unit6);
            }
        });

    }
}
