package com.abulkalam.base_adapter_tutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int books[];
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int[] books) {
        this.context = context;
        this.books = books;
        layoutInflater = (LayoutInflater.from(context.getApplicationContext()));
    }

    @Override
    public int getCount() {
        return books.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.gridview, null);
        ImageView icon = convertView.findViewById(R.id.simpleImageView);
        icon.setImageResource(books[position]);
        return convertView;
    }
}
