package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class R16 extends AppCompatActivity {
    public TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r16);
        textView1 = (TextView)findViewById(R.id.textView1);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view1=new Intent(R16.this,FirstYear.class);
                startActivity(view1);

            }
        });
    }
}
