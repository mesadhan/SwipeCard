package com.pixonlab.swipecardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PageAdapter extends ArrayAdapter<Card> {
  public PageAdapter(Context context, ArrayList<Card> cards) {
    super(context, 0, cards);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    Card card = getItem(position);


    if (convertView == null) {
      convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
    }

    ImageView card_image= convertView.findViewById(R.id.card_image);
    TextView textView = convertView.findViewById(R.id.helloText);
    card_image.setImageResource(card.imageId);
    textView.setText(card.name);


    return convertView;
  }
}