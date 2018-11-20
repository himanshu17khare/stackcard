package com.card.stackcard;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class StackAdapter extends ArrayAdapter<Integer> {
    public StackAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        ImageView imageView=convertView.findViewById(R.id.imageView);
        imageView.setImageResource(getItem(position));
        return convertView;
    }
}
