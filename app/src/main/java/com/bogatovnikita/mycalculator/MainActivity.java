package com.bogatovnikita.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String stringInputTextView = "";
    String symbolOperation = "";
    float valueFirst;
    float valueSecond;

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
        openParenthesis.setOnClickListener(view -> {

        });

        Button closeParenthesis = findViewById(R.id.close_parenthesis_button);
        closeParenthesis.setOnClickListener(view -> {

        });

        Button divide = findViewById(R.id.divide_button);
        divide.setOnClickListener(view -> {
            if (symbolOperation.isEmpty()) {
                symbolOperation = "/";
                valueFirst = Float.parseFloat(stringInputTextView);
                clear();
            }
        });

        Button seven = findViewById(R.id.seven_button);
        seven.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("7");
            inputTextView.setText(stringInputTextView);
        });

        Button eight = findViewById(R.id.eight_button);
        eight.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("8");
            inputTextView.setText(stringInputTextView);
        });

        Button nine = findViewById(R.id.nine_button);
        nine.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("9");
            inputTextView.setText(stringInputTextView);
        });

        Button multiply = findViewById(R.id.multiply_button);
        multiply.setOnClickListener(view -> {

        });

        Button four = findViewById(R.id.four_button);
        four.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("4");
            inputTextView.setText(stringInputTextView);
        });

        Button five = findViewById(R.id.five_button);
        five.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("5");
            inputTextView.setText(stringInputTextView);
        });

        Button six = findViewById(R.id.six_button);
        six.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("6");
            inputTextView.setText(stringInputTextView);
        });

        Button subtract = findViewById(R.id.subtract_button);
        subtract.setOnClickListener(view -> {

        });

        Button three = findViewById(R.id.three_button);
        three.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("3");
            inputTextView.setText(stringInputTextView);
        });

        Button two = findViewById(R.id.two_button);
        two.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("2");
            inputTextView.setText(stringInputTextView);
        });

        Button one = findViewById(R.id.one_button);
        one.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("1");
            inputTextView.setText(stringInputTextView);
        });

        Button fold = findViewById(R.id.fold_button);
        fold.setOnClickListener(view -> {

        });

        Button nullB = findViewById(R.id.null_button);
        nullB.setOnClickListener(view -> {
            if (stringInputTextView.length() <= 7)
                stringInputTextView = stringInputTextView.concat("0");
            inputTextView.setText(stringInputTextView);
        });

        Button comma = findViewById(R.id.comma_button);
        comma.setOnClickListener(view -> {

        });

        Button equals = findViewById(R.id.equals_button);
        equals.setOnClickListener(view -> {

        });
    }

    public void clear() {
        stringInputTextView = "";
    }
}
