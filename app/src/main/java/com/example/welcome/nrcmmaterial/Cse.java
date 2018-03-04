package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cse extends AppCompatActivity {
    public TextView r15,r16,r17;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        r15=(TextView)findViewById(R.id.cseR15);
        r16=(TextView)findViewById(R.id.cseR16);
        r17=(TextView)findViewById(R.id.cseR17);
        r15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r15 =new Intent(Cse.this,R15.class);
                startActivity(r15);
            }
        });
        r16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent R16 = new Intent(Cse.this, R16.class);
                startActivity(R16);
            }
        });

        r17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent R17 = new Intent(Cse.this,R17.class);
                startActivity(R17);
            }
        });

    }




}
