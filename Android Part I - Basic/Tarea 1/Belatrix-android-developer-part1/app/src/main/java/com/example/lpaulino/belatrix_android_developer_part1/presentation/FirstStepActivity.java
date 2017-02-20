package com.example.lpaulino.belatrix_android_developer_part1.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lpaulino.belatrix_android_developer_part1.R;

/**
 * Created by lpaulino on 3/01/17.
 */

public class FirstStepActivity extends AppCompatActivity {

    private static final String [] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};

    private EditText mNumberEditText;
    private TextView mMonthTextView;
    private Button mNextStepButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_step);
        mNumberEditText = (EditText) findViewById(R.id.number_edit_text);
        mMonthTextView = (TextView) findViewById(R.id.month_text_view);
        mNextStepButton = (Button) findViewById(R.id.next_step_button);
        setupListeners();
    }

    private void setupListeners() {
        mNumberEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String number = s.toString();
                try {
                    int value = Integer.parseInt(number);
                    if (value > 0 && value < 12) {
                        mMonthTextView.setText(MONTHS[value - 1]);
                    } else {
                        mMonthTextView.setText(R.string.no_month);
                    }
                } catch (NumberFormatException exception) {
                    mMonthTextView.setText(R.string.no_month);
                }
            }
        });

        mNextStepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstStepActivity.this, SecondStepActivity.class));
            }
        });
    }
}
