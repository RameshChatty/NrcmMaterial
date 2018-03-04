package com.example.welcome.nrcmmaterial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class FirstYear extends AppCompatActivity {
    public TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);
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
        textView11=(TextView)findViewById(R.id.textView11);


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyr=new Intent(FirstYear.this,CseR15Cp.class);
                startActivity(firstyr);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyreng=new Intent(FirstYear.this,CseR15Eng.class);
                startActivity(firstyreng);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyredp=new Intent(FirstYear.this,CseR15Edp.class);
                startActivity(firstyredp);
            }
        });
//
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyrphy=new Intent(FirstYear.this,CseR15Phy.class);
                startActivity(firstyrphy);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyrchem=new Intent(FirstYear.this,CseR15Chem.class);

                startActivity(firstyrchem);
            }
        });


        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyrm1=new Intent(FirstYear.this,CseR15M1.class);
                startActivity(firstyrm1);
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyrmm=new Intent(FirstYear.this,CseR15Mm.class);
                startActivity(firstyrmm);
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyrphychemlab=new Intent(FirstYear.this,CseR15PhyChemLab.class);
                startActivity(firstyrphychemlab);
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyrcplab=new Intent(FirstYear.this,CseR15CpLab.class);
                startActivity(firstyrcplab);
            }
        });

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyritwrkshp=new Intent(FirstYear.this,CseR15ItWkshpLab.class);
                startActivity(firstyritwrkshp);
            }
        });


        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstyrenglab=new Intent(FirstYear.this,CseR15EngLab.class);
                startActivity(firstyrenglab);
            }
        });
//
//
//
//

    }
}
