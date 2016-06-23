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
        final Button subtract = (Button) findViewById(R.id.subtract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button division = (Button) findViewById(R.id.division);
        Button clear = (Button) findViewById(R.id.clear);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstNumber.getText().toString().length() == 0 || secondNumber.getText().toString().length()==0)
                {
                    result.setText("Fields Cannot be Empty");
                }
                else
                {
                    Double addResult = Double.parseDouble(firstNumber.getText().toString()) + Double.parseDouble(secondNumber.getText().toString());
                    if(addResult==Math.round(addResult))
                    {
                        result.setText(Math.round(addResult) + "");
                    }
                    else
                    {
                        result.setText(addResult.toString());
                    }

                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstNumber.getText().toString().length() == 0 || secondNumber.getText().toString().length()==0)
                {
                    result.setText("Fields Cannot be Empty");
                }
                else
                {
                    Double subtractResult = Double.parseDouble(firstNumber.getText().toString()) - Double.parseDouble(secondNumber.getText().toString());
                    if(subtractResult==Math.round(subtractResult))
                    {
                        result.setText(Math.round(subtractResult) + "");
                    }
                    else
                    {
                        result.setText(subtractResult.toString());
                    }

                }

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstNumber.getText().toString().length() == 0 || secondNumber.getText().toString().length()==0)
                {
                    result.setText("Fields Cannot be Empty");
                }
                else
                {
                    Double multiplyResult = Double.parseDouble(firstNumber.getText().toString()) * Double.parseDouble(secondNumber.getText().toString());
                    if(multiplyResult==Math.round(multiplyResult))
                    {
                        result.setText(Math.round(multiplyResult) + "");
                    }
                    else
                    {
                        result.setText(multiplyResult.toString());
                    }

                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(firstNumber.getText().toString().length() == 0 || secondNumber.getText().toString().length()==0)
                {
                    result.setText("Fields Cannot be Empty");
                }
                else
                {
                    if(Double.parseDouble(secondNumber.getText().toString()) == 0)
                    {
                        result.setText("Invalid Operation");
                    }
                    else
                    {
                        Double divisionResult = Double.parseDouble(firstNumber.getText().toString()) / Double.parseDouble(secondNumber.getText().toString()) ;
                        if(divisionResult==Math.round(divisionResult))
                        {
                            result.setText(Math.round(divisionResult) + "");
                        }
                        else
                        {
                            result.setText(divisionResult.toString());
                        }

                    }
                }
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
