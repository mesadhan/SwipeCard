package com.pixonlab.swipecardview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.arjsna.swipecardlib.SwipeCardView;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";

    private ArrayList<Card> al;


    @BindView(R.id.swipe_card_view)
    public SwipeCardView swipeCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);

        al = new ArrayList<>();
        getDummyData(al);


        CardsAdapter arrayAdapter = new CardsAdapter(this, al );


        swipeCardView.setAdapter(arrayAdapter);
        swipeCardView.setFlingListener(new SwipeCardView.OnCardFlingListener() {
            @Override
            public void onCardExitLeft(Object dataObject) {
                Log.i(TAG, "Left Exit");
            }

            @Override
            public void onCardExitRight(Object dataObject) {
                Log.i(TAG, "Right Exit");
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                Log.i(TAG, "Adater to be empty");
                //add more items to adapter and call notifydatasetchanged
            }

            @Override
            public void onScroll(float scrollProgressPercent) {
                Log.i(TAG, "Scroll");
            }

            @Override
            public void onCardExitTop(Object dataObject) {
                Log.i(TAG, "Top Exit");
            }

            @Override
            public void onCardExitBottom(Object dataObject) {
                Log.i(TAG, "Bottom Exit");
            }
        });

        // Optionally add an OnItemClickListener
        swipeCardView.setOnItemClickListener(new SwipeCardView.OnItemClickListener() {
            @Override public void onItemClicked(int itemPosition, Object dataObject) {
                // makeToast(CardSwipeActivity.this, String.valueOf(swipeCardView.getCurrentPosition()));
                Toast.makeText(getApplicationContext(), "onCLick", Toast.LENGTH_SHORT).show();
            }
        });


     /*   swipeCardView.throwRight(); //throw card to right
        swipeCardView.throwLeft(); //throw card to left
        swipeCardView.throwTop(); //throw card to top
        swipeCardView.throwBottom(); //throw card to bottom*/




    }

    static void makeToast(Context ctx, String s) {
        Toast.makeText(ctx, s, Toast.LENGTH_SHORT).show();
    }

    private void getDummyData(ArrayList<Card> al) {
        Card card = new Card();
        card.name = "Card1";
        card.imageId = R.drawable.faces1;
        al.add(card);

        Card card2 = new Card();
        card2.name = "Card2";
        card2.imageId = R.drawable.faces2;
        al.add(card2);
        Card card3 = new Card();
        card3.name = "Card3";
        card3.imageId = R.drawable.faces3;
        al.add(card3);
        Card card4 = new Card();
        card4.name = "Card4";
        card4.imageId = R.drawable.faces4;
        al.add(card4);
    }


    @OnClick(R.id.top) public void top() {
        /**
         * Trigger the right event manually.
         */
        swipeCardView.throwTop();
    }

    @OnClick(R.id.bottom) public void bottom() {
        swipeCardView.throwBottom();
    }

    @OnClick(R.id.left) public void left() {
        swipeCardView.throwLeft();
    }

    @OnClick(R.id.right) public void right() {
        swipeCardView.throwRight();
    }
    /*@OnClick(R.id.restart) public void restart() {
        swipeCardView.restart();
    }

    @OnClick(R.id.position)
    public void toastCurrentPosition(){
        makeToast(this, String.valueOf(swipeCardView.getCurrentPosition()));
    }*/

}
