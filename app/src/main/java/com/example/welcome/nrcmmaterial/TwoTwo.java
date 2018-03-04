package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TwoTwo extends AppCompatActivity {
    public TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_two);


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
                Intent two=new Intent(TwoTwo.this,CseR15Co.class);
                startActivity(two);
            }
        });


        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(TwoTwo.this,CseR15Dbms.class);
                startActivity(two);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(TwoTwo.this,CseR15Jp.class);
                startActivity(two);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(TwoTwo.this,CseR15Es.class);
                startActivity(two);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(TwoTwo.this,CseR15Flat.class);
                startActivity(two);
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(TwoTwo.this,CseR15Daa.class);
                startActivity(two);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(TwoTwo.this,CseR15DbmsLab.class);
                startActivity(two);
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two=new Intent(TwoTwo.this,CseR15JpLab.class);
                startActivity(two);
            }
        });
    }
}
