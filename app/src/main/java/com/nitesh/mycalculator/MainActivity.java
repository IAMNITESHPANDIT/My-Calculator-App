package com.nitesh.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;
    String s1, s2;
    EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ed1 = findViewById(R.id.first);
      ed2 = findViewById(R.id.second);
      ed3 = findViewById(R.id.result);
      b1 = findViewById(R.id.plus);
      b2 = findViewById(R.id.substraction);
      b3 = findViewById(R.id.multiplication);
      b4 = findViewById(R.id.division);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();

                if (s1.isEmpty()){
//                    Toast.makeText(MainActivity.this, "enter the number please !", Toast.LENGTH_SHORT).show();
                    ed1.setError("please  provide first number");
                    ed1.requestFocus();
                }else if (s2.isEmpty()){
                    //Toast.makeText(MainActivity.this, "enter the number please  number 2!", Toast.LENGTH_SHORT).show();
                    ed2.setError("please  provide Second number");
                    ed2.requestFocus();
                }else{
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    double d3 = d1 +d2;
                    double r = d1+d2;
                    ed3.setText(String.valueOf(r));


                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();

                if (s1.isEmpty()){
                    //Toast.makeText(MainActivity.this, "enter the number please !", Toast.LENGTH_SHORT).show();
                    ed1.setError("please provide first number");
                    ed1.requestFocus();
                }else if (s2.isEmpty()){
                    //Toast.makeText(MainActivity.this, "enter the number please  number 2!", Toast.LENGTH_SHORT).show();
                    ed2.setError("please  provide Second number");
                    ed2.requestFocus();
                }else{
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    double r = d1-d2;
                    ed3.setText(String.valueOf(r));


                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();

                if (s1.isEmpty()){
//                    Toast.makeText(MainActivity.this, "enter the number please !", Toast.LENGTH_SHORT).show();
                    ed1.setError("please  provide first number");
                    ed1.requestFocus();
                }else if (s2.isEmpty()){
//                    Toast.makeText(MainActivity.this, "enter the number please  number 2!", Toast.LENGTH_SHORT).show();
                    ed2.setError("please provide second number");
                    ed2.requestFocus();

                }else{
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    double r = d1*d2;
                    ed3.setText(String.valueOf(r));


                }



            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();

                if (s1.isEmpty()){
                    // Toast.makeText(MainActivity.this, "enter the First  number please !", Toast.LENGTH_SHORT).show();
                    ed1.setError("please provide first number");
                    ed1.requestFocus();
                }else if (s2.isEmpty()){
                    //Toast.makeText(MainActivity.this, "enter the Second number please !", Toast.LENGTH_SHORT).show();
                    ed2.setError("please  provide Second number");
                    ed2.requestFocus();
                }else{
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    double r = d1 /d2;
                    ed3.setText(String.valueOf(r));


                }

            }
        });

    }
    }

