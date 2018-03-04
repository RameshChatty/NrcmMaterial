package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15DistributedSystem extends AppCompatActivity {

    public TextView ds1,ds2,ds3,ds4,ds5,ds6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_distributed_system);

        ds1=(TextView)findViewById(R.id.ds1);
        ds2=(TextView)findViewById(R.id.ds2);
        ds3=(TextView)findViewById(R.id.ds3);
        ds4=(TextView)findViewById(R.id.ds4);
        ds5=(TextView)findViewById(R.id.ds5);
        ds6=(TextView)findViewById(R.id.ds6);


        ds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15DistributedSystem.this,DSystemsUnit1Web.class);
                startActivity(web);
            }
        });

        ds2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15DistributedSystem.this,DSystemsUnit2Web.class);
                startActivity(web);
            }
        });
        ds3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15DistributedSystem.this,DSystemsUnit3Web.class);
                startActivity(web);
            }
        });
       ds4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15DistributedSystem.this,DSystemsUnit4Web.class);
                startActivity(web);
            }
        });
        ds5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15DistributedSystem.this,DSystemsUnit5Web.class);
                startActivity(web);
            }
        });
        ds6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15DistributedSystem.this,DSystemsUnit6Web.class);
                startActivity(web);
            }
        });
    }
}
