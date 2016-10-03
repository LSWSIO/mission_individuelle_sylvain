package com.indelogi.mission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String hello = getResources().getString(R.string.hello_world);

        // Or supply a string resource to a method that requires a string
        TextView textView = new TextView(this);
        textView.setText(R.string.hello_world);
    }
}