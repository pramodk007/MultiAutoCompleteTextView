package com.androiddev.multiautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MultiAutoCompleteTextView multiAutoCompleteTextView;
    TextView textView;
    String[] fruits = {"apple","mango","grapes","papaya","lemon","Watermelon","Strawberry","Orange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView_input);
        textView = findViewById(R.id.textView_result);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,fruits);
        multiAutoCompleteTextView.setAdapter(adapter);

        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        textView.setText(getResources().getString(R.string.fruits));


    }
}