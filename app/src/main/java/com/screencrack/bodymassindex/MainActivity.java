package com.screencrack.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import bibek.CalculateBMI;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private EditText EtWeight, EtHeight;
    private Button btnAdd;
    private TextView Tvresult, ResultView;
    float Weight, Height, Result, bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        EtWeight = findViewById(R.id.EtWeight);
        EtHeight = findViewById(R.id.EtHeight);
        Tvresult = findViewById(R.id.Tvresult);
        ResultView = findViewById(R.id.ResultView);
        btnAdd = findViewById(R.id.btnAdd);


        btnAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAdd) {
            Weight = Float.parseFloat(EtWeight.getText().toString());
            Height = Float.parseFloat(EtHeight.getText().toString());

            CalculateBMI cal = new CalculateBMI(Weight, Height);
            bmi = cal.BMI();
            appendStuffs();
            EtHeight.getText().clear();
            EtWeight.getText().clear();
        }

        if (bmi< 16){
            Intent ShowResult = new Intent(MainActivity.this, ShowResult.class);
            String thin = "thiness";
            ShowResult.putExtra("thin", thin);
            startActivity(ShowResult);

        }
        if (bmi< 17){
            Intent ShowResult = new Intent(MainActivity.this, ShowResult.class);
            String thin = "Moderate thiness";
            ShowResult.putExtra("thin", thin);
            startActivity(ShowResult);

        }
        if (bmi< 18.5){
            Intent ShowResult = new Intent(MainActivity.this, ShowResult.class);
            String thin = "Mild Thiness";
            ShowResult.putExtra("thin", thin);
            startActivity(ShowResult);

        }
        if (bmi< 25){
            Intent ShowResult = new Intent(MainActivity.this, ShowResult.class);
            String thin = "Normal";
            ShowResult.putExtra("thin", thin);
            startActivity(ShowResult);

        }
        if (bmi< 30){
            Intent ShowResult = new Intent(MainActivity.this, ShowResult.class);
            String thin = "OverWeight";
            ShowResult.putExtra("thin", thin);
            startActivity(ShowResult);

        }
        if (bmi >30){
            Intent ShowResult = new Intent(MainActivity.this, ShowResult.class);
            String thin = "OverWeight";
            ShowResult.putExtra("thin", thin);
            startActivity(ShowResult);

        }




    }

   private void appendStuffs(){
        Tvresult.append("Your BMI is :"+bmi+ "\n");
    }







}
