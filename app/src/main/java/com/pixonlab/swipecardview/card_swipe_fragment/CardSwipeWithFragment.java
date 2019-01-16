package com.pixonlab.swipecardview.card_swipe_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.pixonlab.swipecardview.R;

/**
 * Created by arjun on 6/3/17.
 */

public class CardSwipeWithFragment extends AppCompatActivity {
  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment_demo);
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .add(R.id.fragment_container, new FragmentDemo())
          .commit();
    }
  }
}
