package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Chem extends AppCompatActivity {
    public TextView chem1,chem2,chem3,chem4,chem5,chem6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_chem);


        chem1=(TextView)findViewById(R.id.chem1);
        chem2=(TextView)findViewById(R.id.chem2);
        chem3=(TextView)findViewById(R.id.chem3);
        chem4=(TextView)findViewById(R.id.chem4);
        chem5=(TextView)findViewById(R.id.chem5);
        chem6=(TextView)findViewById(R.id.chem6);

        chem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit1=new Intent(CseR15Chem.this,ChemUnit1Web.class);
                startActivity(unit1);
            }
        });

        chem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit2=new Intent(CseR15Chem.this,ChemUnit2Web.class);
                startActivity(unit2);
            }
        });
        chem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit3=new Intent(CseR15Chem.this,ChemUnit3Web.class);
                startActivity(unit3);
            }
        });

        chem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit4=new Intent(CseR15Chem.this,ChemUnit4Web.class);
                startActivity(unit4);
            }
        });

        chem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit5=new Intent(CseR15Chem.this,ChemUnit5Web.class);
                startActivity(unit5);
            }
        });

        chem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unit6=new Intent(CseR15Chem.this,ChemUnit6Web.class);
                startActivity(unit6);
            }
        });

    }
}
