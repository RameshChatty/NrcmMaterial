package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Edp extends AppCompatActivity {

    public TextView edp1,edp2,edp3,edp4,edp5,edp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_edp);
        edp1=(TextView)findViewById(R.id.edp1);
        edp2=(TextView)findViewById(R.id.edp2);
        edp3=(TextView)findViewById(R.id.edp3);
        edp4=(TextView)findViewById(R.id.edp4);
        edp5=(TextView)findViewById(R.id.edp5);
        edp6=(TextView)findViewById(R.id.edp6);

        edp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Edp.this,EdpUnit1Web.class);
                startActivity(unit1);
            }
        });

        edp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Edp.this,EdpUnit2Web.class);
                startActivity(unit2);
            }
        });
        edp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Edp.this,EdpUnit3Web.class);
                startActivity(unit3);
            }
        });

        edp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Edp.this,EdpUnit4Web.class);
                startActivity(unit4);
            }
        });

        edp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Edp.this,EdpUnit5Web.class);
                startActivity(unit5);
            }
        });

        edp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Edp.this,EdpUnit6Web.class);
                startActivity(unit6);
            }
        });

    }
}
