package com.example.a1694672.github;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewGroup myContainer;
    TextView myTextView;
    boolean visibility =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myContainer =(ViewGroup)findViewById(R.id.AnimationContainer);
        myTextView =(TextView)findViewById(R.id.textView);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void AnimateClick(View v){

        TransitionManager.beginDelayedTransition(myContainer);
        visibility=!visibility;
        myTextView.setVisibility(visibility?View.VISIBLE:View.INVISIBLE);

    }
}
