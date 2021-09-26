package com.bogatovnikita.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Buttons buttons = new Buttons();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView inputTextView = findViewById(R.id.input_field_text_view);

        if (savedInstanceState != null && savedInstanceState.containsKey("stringInputTextView_key")
                && savedInstanceState.containsKey("symbolOperation_key") && savedInstanceState.containsKey("valueFirst_key")
                && savedInstanceState.containsKey("valueSecond_key") && savedInstanceState.containsKey("temp_key")) {
            buttons.stringInputTextView = savedInstanceState.getString("stringInputTextView_key");
            buttons.symbolOperation = savedInstanceState.getString("symbolOperation_key");
            buttons.valueFirst = savedInstanceState.getDouble("valueFirst_key");
            buttons.valueSecond = savedInstanceState.getDouble("valueSecond_key");
            buttons.temp = savedInstanceState.getDouble("temp_key");
        }

        Button deleteAllValue = findViewById(R.id.delete_all_button);
        deleteAllValue.setOnClickListener(view -> {
            buttons.clearAllCount();
            inputTextView.setText("");
        });

        Button openParenthesis = findViewById(R.id.open_parenthesis_button);
        openParenthesis.setOnClickListener(view -> {
            //stub!
        });

        Button closeParenthesis = findViewById(R.id.close_parenthesis_button);
        closeParenthesis.setOnClickListener(view -> {
            //Stub!
        });

        Button divide = findViewById(R.id.divide_button);
        divide.setOnClickListener(view -> {
            if (buttons.divideButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button seven = findViewById(R.id.seven_button);
        seven.setOnClickListener(view -> {
            if (buttons.buttonSeven())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button eight = findViewById(R.id.eight_button);
        eight.setOnClickListener(view -> {
            if (buttons.buttonEight())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button nine = findViewById(R.id.nine_button);
        nine.setOnClickListener(view -> {
            if (buttons.buttonNine())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button multiply = findViewById(R.id.multiply_button);
        multiply.setOnClickListener(view -> {
            if (buttons.multiplyButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button four = findViewById(R.id.four_button);
        four.setOnClickListener(view -> {
            if (buttons.buttonFour())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button five = findViewById(R.id.five_button);
        five.setOnClickListener(view -> {
            if (buttons.buttonFive())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button six = findViewById(R.id.six_button);
        six.setOnClickListener(view -> {
            if (buttons.buttonSix())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button subtract = findViewById(R.id.subtract_button);
        subtract.setOnClickListener(view -> {
            if (buttons.subtractButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button three = findViewById(R.id.three_button);
        three.setOnClickListener(view -> {
            if (buttons.buttonThree())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button two = findViewById(R.id.two_button);
        two.setOnClickListener(view -> {
            if (buttons.buttonTwo())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button one = findViewById(R.id.one_button);
        one.setOnClickListener(view -> {
            if (buttons.buttonOne())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button fold = findViewById(R.id.fold_button);
        fold.setOnClickListener(view -> {
            if (buttons.foldButton()) {
                buttons.clearTextView();
                inputTextView.setText(buttons.stringInputTextView);
            }
        });

        Button nullB = findViewById(R.id.null_button);
        nullB.setOnClickListener(view -> {
            if (buttons.buttonNull())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button comma = findViewById(R.id.comma_button);
        comma.setOnClickListener(view -> {
            if (buttons.buttonComma())
                inputTextView.setText(buttons.stringInputTextView);
        });

        Button equals = findViewById(R.id.equals_button);
        equals.setOnClickListener(view -> {
            buttons.equalsCount();
            inputTextView.setText(Double.toString(buttons.temp));
            buttons.clearAllCount();
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("stringInputTextView_key", buttons.stringInputTextView);
        outState.putString("symbolOperation_key", buttons.symbolOperation);
        outState.putDouble("valueFirst_key", buttons.valueFirst);
        outState.putDouble("valueSecond_key", buttons.valueSecond);
        outState.putDouble("temp_key", buttons.temp);
    }
}
