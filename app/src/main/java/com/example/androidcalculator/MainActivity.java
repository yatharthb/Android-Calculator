package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view){
        EditText myTextField1;
        EditText myTextField2;
        myTextField1 = (EditText)(findViewById(R.id.myTextField));
        myTextField2 = (EditText)(findViewById(R.id.myTextField1));
        Integer int1 = Integer.parseInt(myTextField1.getText().toString());
        Integer int2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(int1+int2);
    }

    public void clickSub(View view){
        EditText myTextField1;
        EditText myTextField2;
        myTextField1 = (EditText)(findViewById(R.id.myTextField));
        myTextField2 = (EditText)(findViewById(R.id.myTextField1));
        Integer int1 = Integer.parseInt(myTextField1.getText().toString());
        Integer int2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(int1-int2);
    }

    public void clickMult(View view){
        EditText myTextField1;
        EditText myTextField2;
        myTextField1 = (EditText)(findViewById(R.id.myTextField));
        myTextField2 = (EditText)(findViewById(R.id.myTextField1));
        Integer int1 = Integer.parseInt(myTextField1.getText().toString());
        Integer int2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(int1*int2);
    }

    public void clickDiv(View view){
        EditText myTextField1;
        EditText myTextField2;
        myTextField1 = (EditText)(findViewById(R.id.myTextField));
        myTextField2 = (EditText)(findViewById(R.id.myTextField1));
        Integer int1 = Integer.parseInt(myTextField1.getText().toString());
        Integer int2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(int1/int2);
    }

    public void goToActivity2(int i){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", i);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}