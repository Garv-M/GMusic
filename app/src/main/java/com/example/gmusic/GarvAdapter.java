package com.example.gmusic;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GarvAdapter extends ArrayAdapter<String> {

    private String arr1[];
    private Context context;

    public GarvAdapter(@NonNull Context context, int resource, @NonNull String[] items) {
        super(context, resource, items);
        this.context = context;
        arr1 = items;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr1[position];
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.garvlayout, parent, false);
        TextView t = row.findViewById(R.id.textView_headset);
        t.setText(getItem(position));
        return row;


    }
}

