package com.wenju.aligntextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private AlignTextView alignTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alignTextView = findViewById(R.id.align_text);
        alignTextView.setTextIsSelectable(true);
    }
}
