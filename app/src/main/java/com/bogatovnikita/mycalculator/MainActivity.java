package com.bogatovnikita.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String stringInputTextView = "";
    String symbol = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inputTextView = findViewById(R.id.input_field_text_view);

        Button deleteAllValue = findViewById(R.id.delete_all_button);
        deleteAllValue.setOnClickListener(view -> {
            clear();
            inputTextView.setText(stringInputTextView);
        });

        Button openParenthesis = findViewById(R.id.open_parenthesis_button);
        openParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button closeParenthesis = findViewById(R.id.close_parenthesis_button);
        closeParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button divide = findViewById(R.id.divide_button);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button seven = findViewById(R.id.seven_button);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("7");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button eight = findViewById(R.id.eight_button);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("8");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button nine = findViewById(R.id.nine_button);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("9");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button multiply = findViewById(R.id.multiply_button);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button four = findViewById(R.id.four_button);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("4");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button five = findViewById(R.id.five_button);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("5");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button six = findViewById(R.id.six_button);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("6");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button subtract = findViewById(R.id.subtract_button);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button three = findViewById(R.id.three_button);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("3");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button two = findViewById(R.id.two_button);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("2");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button one = findViewById(R.id.one_button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("1");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button fold = findViewById(R.id.fold_button);
        fold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button nullB = findViewById(R.id.null_button);
        nullB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stringInputTextView.length() <= 7)
                    stringInputTextView = stringInputTextView.concat("0");
                inputTextView.setText(stringInputTextView);
            }
        });

        Button comma = findViewById(R.id.comma_button);
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button equals = findViewById(R.id.equals_button);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void clear() {
        stringInputTextView = "";
    }
}