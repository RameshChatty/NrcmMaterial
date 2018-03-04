package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Mefa extends AppCompatActivity {
    public TextView mefa1,mefa2,mefa3,mefa4,mefa5,mefa6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_mefa);

        mefa1=(TextView)findViewById(R.id.mefa1);
        mefa2=(TextView)findViewById(R.id.mefa2);
        mefa3=(TextView)findViewById(R.id.mefa3);
        mefa4=(TextView)findViewById(R.id.mefa4);
        mefa5=(TextView)findViewById(R.id.mefa5);
        mefa6=(TextView)findViewById(R.id.mefa6);


        mefa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Mefa.this,MefaUnit1Web.class);
                startActivity(web);
            }
        });

        mefa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Mefa.this,MefaUnit2Web.class);
                startActivity(web);
            }
        });
        mefa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Mefa.this,MefaUnit3Web.class);
                startActivity(web);
            }
        });
        mefa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Mefa.this,MefaUnit4Web.class);
                startActivity(web);
            }
        });
        mefa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Mefa.this,MefaUnit5Web.class);
                startActivity(web);
            }
        });
        mefa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Mefa.this,MefaUnit6Web.class);
                startActivity(web);
            }
        });
    }
}
