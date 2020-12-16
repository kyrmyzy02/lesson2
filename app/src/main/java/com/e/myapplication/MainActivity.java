package com.e.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText number1, number2;
    Button btnPlus, btnMinus;
    Button btnMulti, btnDivide;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.et_number1);
        number2 = findViewById(R.id.et_number2);

        btnPlus = findViewById(R.id.button_plus);
        btnMinus = findViewById(R.id.button_minus);
        btnMulti = findViewById(R.id.button_multi);
        btnDivide = findViewById(R.id.button_divide);

        result = findViewById(R.id.tv_result);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int res = 0;
        if (view.getId() == R.id.button_plus) {
            res = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
        } else if (view.getId() == R.id.button_minus) {
            res = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
        } else if (view.getId() == R.id.button_multi) {
            res = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
        } else if (view.getId() == R.id.button_divide) {
            res = Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());

        }

        result.setText("Result: " + res);
    }

    public void BtnPlusClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }

    public void BtnMinusClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }

    public void BtnMultiClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }

    public void BtnDivideClicked(View view) {
        int res = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());

        result.setText("Result: " + res);
    }
}