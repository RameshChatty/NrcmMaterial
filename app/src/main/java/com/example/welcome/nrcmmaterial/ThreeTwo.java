package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThreeTwo extends AppCompatActivity {
    public TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_two);

        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        textView8=(TextView)findViewById(R.id.textView8);
        textView9=(TextView)findViewById(R.id.textView9);
        textView10=(TextView)findViewById(R.id.textView10);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15DistributedSystem.class);
                startActivity(one);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15Ism.class);
                startActivity(one);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15Is.class);
                startActivity(one);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15Ia.class);
                startActivity(one);
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15Ooad.class);
                startActivity(one);
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15Wt.class);
                startActivity(one);
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15Stm.class);
                startActivity(one);
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15Mefa.class);
                startActivity(one);
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15AcsLab.class);
                startActivity(one);
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one=new Intent(ThreeTwo.this,CseR15CtWtLab.class);
                startActivity(one);
            }
        });
    }
}
