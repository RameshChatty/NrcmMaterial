package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TwoOne extends AppCompatActivity {
    public TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_one);

        textView1=(TextView)findViewById(R.id.textView1);

        textView2=(TextView)findViewById(R.id.textView2);

        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        textView8=(TextView)findViewById(R.id.textView8);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15Pbb.class);
                startActivity(one);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15Mfcs.class);
                startActivity(one);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15Ds.class);
                startActivity(one);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15Dld.class);
                startActivity(one);
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15Edc.class);
                startActivity(one);
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15Bee.class);
                startActivity(one);
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15EdcLab.class);
                startActivity(one);
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(TwoOne.this,CseR15DsLab.class);
                startActivity(one);
            }
        });
    }
}
