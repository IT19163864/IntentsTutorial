package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
        findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }

    public void onPressOk(View view){

        Context context = getApplicationContext();
        CharSequence message = "Sending Values ...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();


        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
        EditText numInput1 = (EditText)findViewById(R.id.num1);
        EditText numInput2 = (EditText)findViewById(R.id.num2);
        String num1,num2;
        num1 = numInput1.getText().toString();
        num2 = numInput2.getText().toString();
        intent.putExtra("VAL_1", num1);
        intent.putExtra("VAL_2", num2);
        startActivity(intent);
    }
}