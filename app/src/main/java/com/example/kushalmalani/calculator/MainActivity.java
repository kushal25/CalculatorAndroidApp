package com.example.kushalmalani.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews()
    {
        final EditText firstNumber = (EditText) findViewById(R.id.firstnum);
        final EditText secondNumber = (EditText) findViewById(R.id.secondnum);
        final TextView result = (TextView) findViewById(R.id.result);
        Button add = (Button) findViewById(R.id.add);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button division = (Button) findViewById(R.id.division);
        Button clear = (Button) findViewById(R.id.clear);

        final Float first = Float.parseFloat(firstNumber.getText().toString());
        final Float second = Float.parseFloat(secondNumber.getText().toString());

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float addResult = first + second;
                result.setText(addResult.toString());
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float subtractResult = Float.parseFloat(firstNumber.getText().toString()) - Float.parseFloat(secondNumber.getText().toString()) ;
                result.setText(subtractResult.toString());
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float multiplyResult = Float.parseFloat(firstNumber.getText().toString()) * Float.parseFloat(secondNumber.getText().toString()) ;
                result.setText(multiplyResult.toString());
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float divisionResult = Float.parseFloat(firstNumber.getText().toString()) / Float.parseFloat(secondNumber.getText().toString()) ;
                result.setText(divisionResult.toString());
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                firstNumber.setText("");
                secondNumber.setText("");
            }
        });
    }
}
