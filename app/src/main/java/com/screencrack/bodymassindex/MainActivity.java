package com.screencrack.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText EtWeight , EtHeight ;
    private Button BtnCalculate;
    private TextView  Tvresult;
    float Weight, Height , Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        EtWeight = findViewById(R.id.EtWeight);
        EtHeight = findViewById(R.id.EtHeight);
        Tvresult = findViewById(R.id.Tvresult);
        BtnCalculate = findViewById(R.id.BtnCalculate);

        //Button ClickListener
        BtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Weight = Float.parseFloat(EtWeight.getText().toString());
              Height = Float.parseFloat(EtHeight.getText().toString());
              Result = Weight / (Height * Height);
                //Toast.makeText(MainActivity.this, "The BMi is" + Result, Toast.LENGTH_SHORT).show();
        Tvresult.setText("THe BMi is "+Result);

         if (Result < 16){
             //Severe THiness
             Toast.makeText(MainActivity.this, "Serve thiness " + Result, Toast.LENGTH_SHORT).show();

         }
         if (Result >17){
             //Moderate thiness
             Toast.makeText(MainActivity.this, "Moderate thiness " + Result, Toast.LENGTH_SHORT).show();
         }
         if (Result >18.5){
                    //Mild-thiness
             Toast.makeText(MainActivity.this, "Mild thiness " + Result, Toast.LENGTH_SHORT).show();
                }
         if (Result > 25){
             //Normal
             Toast.makeText(MainActivity.this, "Normal " + Result, Toast.LENGTH_SHORT).show();
         }
         if (Result <30){
             //Overweight
             Toast.makeText(MainActivity.this, "OverWeight " + Result, Toast.LENGTH_SHORT).show();
         }
         if (Result >30){
             //Obese Class
             Toast.makeText(MainActivity.this, "Obese class " + Result, Toast.LENGTH_SHORT).show();
         }
            }
        });
    }



}
