package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class R15 extends AppCompatActivity {
    public TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r15);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2) ;

        textView3 = (TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4) ;



        textView5 = (TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6) ;


        textView7 = (TextView)findViewById(R.id.textView7);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view1=new Intent(R15.this,FirstYear.class);
                startActivity(view1);

            }
        });



        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view2=new Intent(R15.this,TwoOne.class);
                startActivity(view2);

            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view3=new Intent(R15.this,TwoTwo.class);
                startActivity(view3);

            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view4=new Intent(R15.this,ThreeOne.class);
                startActivity(view4);

            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view5=new Intent(R15.this,ThreeTwo.class);
                startActivity(view5);

            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view1=new Intent(R15.this,FourOne.class);
                startActivity(view1);

            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view1=new Intent(R15.this,FourTwo.class);
                startActivity(view1);

            }
        });
    }
}
