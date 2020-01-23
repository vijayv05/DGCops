package com.appdynamics.dgcops;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public abstract class AbstractScreen extends AppCompatActivity {

    LinearLayout ll = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

//        FrameLayout fl = new FrameLayout();

        ImageView iv = new ImageView(this);

        iv.setImageResource(R.drawable.appd);

//        iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));

        ll.addView(iv, new ViewGroup.LayoutParams(-2,200));

        setContentView(ll);

    }

//    protected void setBanner() {
//        LinearLayout ll = new LinearLayout(this);
//        ll.setOrientation(LinearLayout.VERTICAL);
//
//        ImageView iv = new ImageView(this);
//        iv.setImageResource(R.drawable.appd);
//        iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        setContentView(ll);
//    }
}
