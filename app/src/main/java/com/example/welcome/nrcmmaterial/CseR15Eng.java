package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class CseR15Eng extends AppCompatActivity {
    public TextView eng1,eng2,eng3,eng4,eng5,eng6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_eng);

        eng1=(TextView)findViewById(R.id.eng1);
        eng2=(TextView)findViewById(R.id.eng2);
        eng3=(TextView)findViewById(R.id.eng3);
        eng4=(TextView)findViewById(R.id.eng4);
        eng5=(TextView)findViewById(R.id.eng5);
        eng6=(TextView)findViewById(R.id.eng6);

        eng1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english =new Intent(CseR15Eng.this,EngUnit1Web.class);
                startActivity(english);
            }
        });
        eng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english =new Intent(CseR15Eng.this,EngUnit2Web.class);
                startActivity(english);
            }
        });

        eng3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english =new Intent(CseR15Eng.this,EngUnit3Web.class);
                startActivity(english);
            }
        });
        eng4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english =new Intent(CseR15Eng.this,EngUnit4Web.class);
                startActivity(english);
            }
        });
        eng5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english =new Intent(CseR15Eng.this,EngUnit5Web.class);
                startActivity(english);
            }
        });
        eng6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english =new Intent(CseR15Eng.this,EngUnit6Web.class);
                startActivity(english);
            }
        });

    }
}
