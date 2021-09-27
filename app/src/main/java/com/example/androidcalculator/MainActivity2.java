package com.example.androidcalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        int i = intent.getIntExtra("message", 0);
        String s = "" + i;
        textView3.setText(s);

    }

}