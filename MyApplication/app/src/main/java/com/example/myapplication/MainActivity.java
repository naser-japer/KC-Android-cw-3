
package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Calculator = findViewById(R.id.textView);
        TextView total = findViewById(R.id.textView2);
        Button calculat = findViewById(R.id.button1);
        EditText FirstNumber = findViewById(R.id.editText);
        EditText SecondNumber = findViewById(R.id.editText2);
    }
}