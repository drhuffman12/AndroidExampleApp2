package com.example.androidexampleapp2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if (getIntent().hasExtra(getPackageName() + ".SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String str = getIntent().getExtras().getString(getPackageName() + ".SOMETHING");
            tv.setText(str);
        }
    }
}
