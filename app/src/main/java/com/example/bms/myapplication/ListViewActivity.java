package com.example.bms.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends AppCompatActivity {

    String Food[] = {"Milk","Poha","Bread","Egg"};
    String Qty[] = {"One Cup", "One Bowl", "Two Slices", "Two"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.listview);

        CustomListAdapter mAdapter = new CustomListAdapter();
        listView.setAdapter(mAdapter);
    }

    class CustomListAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {

            view = getLayoutInflater().inflate(R.layout.listitem, null);

            TextView food = view.findViewById(R.id.tv1);
            TextView qty = view.findViewById(R.id.tv2);

            food.setText(Food[position]);
            qty.setText(Qty[position]);
            return view;
        }
    }
}
