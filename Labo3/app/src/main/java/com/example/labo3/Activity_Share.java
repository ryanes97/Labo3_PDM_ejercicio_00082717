package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_Share extends AppCompatActivity {

    private TextView mtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__share2);

        mtxt = findViewById(R.id.txt_share);

        Intent mIntent = getIntent();

        if (mIntent != null) {
            mtxt.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
