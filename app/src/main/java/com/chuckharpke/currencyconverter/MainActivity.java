package com.chuckharpke.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText dollarField = (EditText) findViewById(R.id.dollarField);

        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        // Convert to pounds

        Double poundAmount = dollarAmount * 0.65;


        Log.i("poundAmount", poundAmount.toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
