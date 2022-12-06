package com.example.spinner2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter {
    Context context;
    String cityList[];
    String[] capitals;
    int symbols[];
    LayoutInflater inflter;

    public customAdapter(Context applicationContext, String[] cityList, int[] symbols, String[] capitals) {
        this.context = applicationContext;
        this.cityList = cityList;
        this.symbols = symbols;
        this.capitals = capitals;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spin_layout, null);
        TextView city = (TextView) view.findViewById(R.id.tv4);
        TextView capital = (TextView) view.findViewById(R.id.tv5);
        ImageView symbol = (ImageView) view.findViewById(R.id.iv1);
        city.setText(cityList[i]);
        capital.setText(capitals[i]);
        symbol.setImageResource(symbols[i]);
        return view;
    }
}
