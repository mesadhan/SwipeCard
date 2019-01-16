package com.pixonlab.swipecardview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pixonlab.swipecardview.card_swipe_fragment.CardSwipeWithFragment;
import com.pixonlab.swipecardview.cards_wipe.CardSwipeActivity;
import com.pixonlab.swipecardview.page_swipe.PageSwipeActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        findViewById(R.id.card_swipe_demo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CardSwipeActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.page_swipe_demo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PageSwipeActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.card_swipe_fragment_demo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CardSwipeWithFragment.class);
                startActivity(intent);
            }
        });
    }

}
