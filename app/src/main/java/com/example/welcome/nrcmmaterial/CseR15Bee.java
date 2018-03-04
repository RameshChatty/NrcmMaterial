package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CseR15Bee extends AppCompatActivity {
    public TextView bee1,bee2,bee3,bee4,bee5,bee6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_r15_bee);

        bee1=(TextView)findViewById(R.id.bee1);
        bee2=(TextView)findViewById(R.id.bee2);
        bee3=(TextView)findViewById(R.id.bee3);
        bee4=(TextView)findViewById(R.id.bee4);
        bee5=(TextView)findViewById(R.id.bee5);
        bee6=(TextView)findViewById(R.id.bee6);


        bee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Bee.this,BeeUnit1Web.class);
                startActivity(web);
            }
        });

        bee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Bee.this,BeeUnit2Web.class);
                startActivity(web);
            }
        });
        bee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Bee.this,BeeUnit3Web.class);
                startActivity(web);
            }
        });
        bee4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Bee.this,BeeUnit4Web.class);
                startActivity(web);
            }
        });
        bee5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Bee.this,BeeUnit5Web.class);
                startActivity(web);
            }
        });
        bee6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web =new Intent(CseR15Bee.this,BeeUnit6Web.class);
                startActivity(web);
            }
        });
    }
}
