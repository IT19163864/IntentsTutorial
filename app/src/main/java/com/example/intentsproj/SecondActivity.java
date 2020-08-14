package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int num1,num2;
    String result;
    EditText numInput1,numInput2;
    TextView resultText;
    Button addButton,subtractButton,multiplyButton,divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        numInput1 = (EditText)findViewById(R.id.num1);
        numInput2 = (EditText)findViewById(R.id.num2);
        resultText = (TextView)findViewById(R.id.resultText);
        addButton = (Button) findViewById(R.id.addButton);
        subtractButton = (Button) findViewById(R.id.subtractButton);
        multiplyButton = (Button) findViewById(R.id.multiplyButton);
        divideButton = (Button) findViewById(R.id.divideButton);

        Bundle extras = getIntent().getExtras();

        if(extras == null){
            numInput1.setText("Empty");
            numInput2.setText("Empty");
            resultText.setText("Empty");
        }
        else {
            numInput1.setText(extras.getString("VAL_1"));
            numInput2.setText(extras.getString("VAL_2"));
            resultText.setText("");
        }
    }

    public void onPressAdd(View view){
        try {
            num1 = Integer.parseInt(numInput1.getText().toString());
            num2 = Integer.parseInt(numInput2.getText().toString());
        } catch (NumberFormatException e){
            System.out.println("Failed to parse: " + e);
        }
        result = num1 + " + " + num2 + " = " + (num1+num2);
        resultText.setText(result);
    }

    public void onPressSubtract(View view){
        try {
            num1 = Integer.parseInt(numInput1.getText().toString());
            num2 = Integer.parseInt(numInput2.getText().toString());
        } catch (NumberFormatException e){
            System.out.println("Failed to parse: " + e);
        }
        result = num1 + " -" + num2 + " = " + (num1-num2);
        resultText.setText(result);
    }

    public void onPressMultiply(View view){
        try {
            num1 = Integer.parseInt(numInput1.getText().toString());
            num2 = Integer.parseInt(numInput2.getText().toString());
        } catch (NumberFormatException e){
            System.out.println("Failed to parse: " + e);
        }
        result = num1 + " * " + num2 + " = " + (num1*num2);
        resultText.setText(result);
    }

    public void onPressDivide(View view){
        try {
            num1 = Integer.parseInt(numInput1.getText().toString());
            num2 = Integer.parseInt(numInput2.getText().toString());
        } catch (NumberFormatException e){
            System.out.println("Failed to parse: " + e);
        }
        result = num1 + " / " + num2 + " = " + ((float)num1/num2);
        resultText.setText(result);
    }
}