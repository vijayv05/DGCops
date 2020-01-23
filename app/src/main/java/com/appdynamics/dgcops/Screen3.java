package com.appdynamics.dgcops;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.content.Intent;
import android.text.Layout;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.textclassifier.TextClassifier;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.appdynamics.dgcops.model.PlatformCard;
import com.appdynamics.dgcops.utils.DemoLoadPlatformCards;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Screen3 extends AbstractScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final Context context = this;
        super.onCreate(savedInstanceState);



        Intent intent = getIntent();

        ArrayList<ECDetails> ec = (ArrayList<ECDetails>) intent.getSerializableExtra("ECDeatilsList");

        TextView ecList = new TextView(context);
        ecList.setText("Enterprise Console List");
        ecList.setTextSize(30);
        ecList.setTypeface(Typeface.DEFAULT_BOLD);
        ecList.setGravity(Gravity.CENTER);

        ll.addView(ecList);

        ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(
                ViewGroup.MarginLayoutParams.WRAP_CONTENT,
                ViewGroup.MarginLayoutParams.WRAP_CONTENT);

        params.setMargins(10,10, 10, -2);

        LinearLayout addRemoveButtons = new LinearLayout(context);
        addRemoveButtons.setOrientation(LinearLayout.HORIZONTAL);
        params.setMargins(20,20, -2, -2);
        addRemoveButtons.setLayoutParams(params);


        Button add = new Button(context);
        add.setBackgroundColor(Color.GRAY);
        add.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        add.setText("ADD");
        add.setHeight(30);
        add.setClipToOutline(true);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Screen2.class);
                startActivity(intent);

            }


        });


        Button remove = new Button(context);
        remove.setBackgroundColor(Color.GRAY);
        remove.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        remove.setText("REMOVE");
        remove.setHeight(30);
        remove.setClipToOutline(true);

        TextView dummyText = new TextView(context);
        dummyText.setText("  ");

        addRemoveButtons.addView(add);
        addRemoveButtons.addView(dummyText);
        addRemoveButtons.addView(remove);

        ll.addView(addRemoveButtons);

        LinearLayout list = new LinearLayout(context);
        list.setOrientation(LinearLayout.VERTICAL);
        params.setMargins(50,20, -2, -2);
        list.setLayoutParams(params);
        list.setGravity(Gravity.CENTER);
        list.setBackgroundResource(R.drawable.custom_background);

        for (int i = 0; i < ec.size() ; i++) {
            String ecName = ec.get(i).getEcname();

//            LinearLayout textView = new LinearLayout(context);
//            textView.setOrientation(LinearLayout.HORIZONTAL);
//            textView.

            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

            LinearLayout fl = new LinearLayout(context);
            fl.setOrientation(LinearLayout.HORIZONTAL);
            fl.setLayoutParams(layoutParams);
            fl.setBackgroundResource(R.drawable.custom_background);

            TextView tv = new TextView(this);
            tv.setLayoutParams(layoutParams);
            tv.setText(ecName);
            tv.setWidth(800);
            tv.setTextSize(24);
            tv.setClickable(true);
            tv.setGravity(Gravity.LEFT);
            tv.setFocusable(true);
            tv.setBackgroundResource(R.color.colorGray);
            tv.setContextClickable(true);
            tv.setSingleLine(true);


            if(tv.getText().toString().contains("Prod")) {
                tv.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        setContentView(R.layout.screen5);
                    }
                });
            } else {
                tv.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        setContentView(R.layout.screen5a);
                    }
                });
            }

            fl.addView(tv);

            list.addView(fl);



        }
//        String[] textArray={"one","two","asdasasdf asdf dsdaa"};
//        int length=textArray.length;
//        RelativeLayout layout = new RelativeLayout(this);
//        RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams(
//                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//        for(int i=0;i<length;i++){
//            TextView tv=new TextView(getApplicationContext());
//            tv.setText(textArray[i]);
//            relativeParams.addRule(RelativeLayout.BELOW, tv.getId());
//            layout.addView(tv, relativeParams);
//        }

        //setContentView(ll);
        ll.addView(list);

        setContentView(ll);


    }




}
