package com.example.niraj.humptyapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Heritage> {


    public Adapter(Context context, List<Heritage> heritages) {
        super(context, 0, heritages);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);

        ImageView ivHeritage = (ImageView) convertView.findViewById(R.id.iv_picture);
        TextView tvHeritage = (TextView) convertView.findViewById(R.id.tv_heritage);

        ivHeritage.setImageResource(getItem(position).getImage());
        tvHeritage.setText(getItem(position).getName());


       /* ImageView iviHeritage=(ImageView) convertView.findViewById(R.id.ivi_picture);
        TextView tvvHeritage=(TextView) convertView.findViewById(R.id.tvv_heritage);

        iviHeritage.setImageResource(getItem(position).getImage());
        tvvHeritage.setText(getItem(position).getName());

        ImageView iviiHeritage = (ImageView) convertView.findViewById(R.id.ivii_picture);
        TextView tvvvHeritage = (TextView) convertView.findViewById(R.id.tvvv_heritage);

        iviiHeritage.setImageResource(getItem(position).getImage());
        tvvvHeritage.setText(getItem(position).getName());*/

        return convertView;
    }
}
