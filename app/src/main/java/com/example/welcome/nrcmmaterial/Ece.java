package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ece extends AppCompatActivity {
    public TextView eceR15,eceR16,eceR17;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);
        eceR15=(TextView)findViewById(R.id.eceR15);
        eceR16=(TextView)findViewById(R.id.eceR16);
        eceR17=(TextView)findViewById(R.id.eceR17);
        eceR15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r15 =new Intent(Ece.this,EceR15.class);
                startActivity(r15);
            }
        });

        eceR16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r16 =new Intent(Ece.this,EceR16.class);
                startActivity(r16);
            }
        });
        eceR17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r17 =new Intent(Ece.this,EceR17.class);
                startActivity(r17);
            }
        });



    }




}
