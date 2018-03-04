package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Stm extends AppCompatActivity {

    public TextView stm1,stm2,stm3,stm4,stm5,stm6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_stm);
        stm1=(TextView)findViewById(R.id.stm1);
        stm2=(TextView)findViewById(R.id.stm2);
        stm3=(TextView)findViewById(R.id.stm3);
        stm4=(TextView)findViewById(R.id.stm4);
        stm5=(TextView)findViewById(R.id.stm5);
        stm6=(TextView)findViewById(R.id.stm6);

        stm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Stm.this,StmUnit1Web.class);
                startActivity(unit1);
            }
        });

        stm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Stm.this,StmUnit2Web.class);
                startActivity(unit2);
            }
        });
        stm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Stm.this,StmUnit3Web.class);
                startActivity(unit3);
            }
        });

        stm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Stm.this,StmUnit4Web.class);
                startActivity(unit4);
            }
        });

        stm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Stm.this,StmUnit5Web.class);
                startActivity(unit5);
            }
        });

        stm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Stm.this,StmUnit6Web.class);
                startActivity(unit6);
            }
        });

    }
}
