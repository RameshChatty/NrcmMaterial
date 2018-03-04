package com.example.welcome.nrcmmaterial;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton1,imageButton2,imageButton3;

    ListView gvMainScreen;
    int[] images = new int[]{
            R.drawable.cse, R.drawable.ece1, R.drawable.mech3
    };

    String[] text = new String[]{
            "cse","ece","mech"
    };

    MainScreenAdapter mainScreenAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvMainScreen = (ListView)findViewById(R.id.gvMainScreen);

        mainScreenAdapter = new MainScreenAdapter(this,images,text);
        gvMainScreen.setAdapter(mainScreenAdapter);

        gvMainScreen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    startActivity(new Intent(MainActivity.this,Cse.class));
                }
            }
        });

    }

    public class MainScreenAdapter extends BaseAdapter{

        private Context context;
        int[] icons;
        String [] text;
        LayoutInflater inflater;

        public MainScreenAdapter(Context context, int[] icons, String[] text) {
            this.context = context;
            this.icons = icons;
            this.text = text;
            inflater = (LayoutInflater)getSystemService(context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return icons.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = inflater.inflate(R.layout.main_adapter,parent,false);

            ImageView imgMainicon = (ImageView)convertView.findViewById(R.id.imgMainicon);
            TextView tvMainName = (TextView)convertView.findViewById(R.id.tvMainName);

            imgMainicon.setImageResource(icons[position]);
            tvMainName.setText(text[position]);

            return convertView;
        }
    }

}
