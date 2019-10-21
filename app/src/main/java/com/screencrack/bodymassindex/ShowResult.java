package com.screencrack.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowResult extends AppCompatActivity {

    TextView ResultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        ResultView = findViewById(R.id.ResultView);
        //create the get Intent Object
        Intent intent =getIntent();
        String str =intent.getStringExtra("thin");
        ResultView.setText(str);
    }
}
