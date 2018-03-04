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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class BranchesListActivity extends AppCompatActivity {

    ListView lvBranches;
    BranchesAdapter branchesAdapter;

    int[] images = new int[]{
            R.drawable.cse, R.drawable.ece1, R.drawable.mech3
    };

    String[] text = new String[]{
            "cse","ece","mech"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches_list);

        lvBranches = (ListView)findViewById(R.id.lvBranches);

        branchesAdapter = new BranchesAdapter(this,images,text);
        lvBranches.setAdapter(branchesAdapter);

        lvBranches.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Intent intent = new Intent(BranchesListActivity.this,Cse.class);
                    startActivity(intent);
                }

                if (position == 1){
                    Intent intent = new Intent(BranchesListActivity.this,Ece.class);
                    startActivity(intent);
                }

            }
        });


    }

    public class BranchesAdapter extends BaseAdapter{

        private Context context;
        int[] icons;
        String [] text;
        LayoutInflater inflater;

        public BranchesAdapter(Context context, int[] icons, String[] text) {
            this.context = context;
            this.icons = icons;
            this.text = text;
            inflater = (LayoutInflater)getSystemService(context.LAYOUT_INFLATER_SERVICE);

        }



        @Override
        public int getCount() {
            return text.length;
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

            convertView = inflater.inflate(R.layout.branches_adapter,parent,false);

            ImageView imgMainicon = (ImageView)convertView.findViewById(R.id.imgMainicon);
            TextView tvMainName = (TextView)convertView.findViewById(R.id.tvMainName);

            imgMainicon.setImageResource(icons[position]);
            tvMainName.setText(text[position]);


            return convertView;
        }
    }

}
