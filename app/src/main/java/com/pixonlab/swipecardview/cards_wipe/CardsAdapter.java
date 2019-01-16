package com.pixonlab.swipecardview.cards_wipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pixonlab.swipecardview.Card;
import com.pixonlab.swipecardview.R;

import java.util.ArrayList;



public class CardsAdapter extends ArrayAdapter<Card> {
  public CardsAdapter(Context context, ArrayList<Card> cards) {
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