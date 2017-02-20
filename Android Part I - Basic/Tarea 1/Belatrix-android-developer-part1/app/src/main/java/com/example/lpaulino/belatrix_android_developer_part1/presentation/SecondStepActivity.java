package com.example.lpaulino.belatrix_android_developer_part1.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lpaulino.belatrix_android_developer_part1.R;

/**
 * Created by lpaulino on 3/01/17.
 */

public class SecondStepActivity extends AppCompatActivity {

    private EditText mFirstNumberEditText;
    private EditText mSecondNumberEditText;
    private EditText mOperationEditText;
    private TextView mOperationResultTextView;
    private Button mCalculateButton;
    private Button mNextStepButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_step);
        mFirstNumberEditText = (EditText) findViewById(R.id.first_number_edit_text);
        mSecondNumberEditText = (EditText) findViewById(R.id.second_number_edit_text);
        mOperationEditText = (EditText) findViewById(R.id.operator_edit_text);
        mOperationResultTextView = (TextView) findViewById(R.id.result_text_view);
        mCalculateButton = (Button) findViewById(R.id.calculate_button);
        mNextStepButton = (Button) findViewById(R.id.next_step_button);
        setupListeners();
    }

    private void setupListeners() {
        mCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operator = mOperationEditText.getText().toString().trim();
                try {
                    double firstNumber = Double.parseDouble(mFirstNumberEditText.getText().toString());
                    double secondNumber = Double.parseDouble(mSecondNumberEditText.getText().toString());
                    if (!operator.equals("")) {
                        switch (operator) {
                            case "<":
                                mOperationResultTextView.setText(firstNumber < secondNumber ? R.string.result_true : R.string.result_false);
                                break;
                            case ">":
                                mOperationResultTextView.setText(firstNumber > secondNumber ? R.string.result_true : R.string.result_false);
                                break;
                            case "<=":
                                mOperationResultTextView.setText(firstNumber <= secondNumber ? R.string.result_true : R.string.result_false);
                                break;
                            case ">=":
                                mOperationResultTextView.setText(firstNumber >= secondNumber ? R.string.result_true : R.string.result_false);
                                break;
                            case "==":
                                mOperationResultTextView.setText(firstNumber == secondNumber ? R.string.result_true : R.string.result_false);
                                break;
                            case "+":
                                mOperationResultTextView.setText(String.valueOf(firstNumber + secondNumber));
                                break;
                            case "-":
                                mOperationResultTextView.setText(String.valueOf(firstNumber - secondNumber));
                                break;
                            case "*":
                                mOperationResultTextView.setText(String.valueOf(firstNumber * secondNumber));
                                break;
                            case "/":
                                if (secondNumber != 0.0) {
                                    mOperationResultTextView.setText(String.valueOf(firstNumber / secondNumber));
                                } else {
                                    mOperationResultTextView.setText(R.string.operation_exception);
                                }
                                break;
                            default:
                                mOperationResultTextView.setText(R.string.no_operation);
                        }
                    } else {
                        mOperationResultTextView.setText(R.string.no_operation);
                    }
                } catch (NumberFormatException exception) {
                    mOperationResultTextView.setText(R.string.no_operation);
                }
            }
        });
        mNextStepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondStepActivity.this, ThirdStepActivity.class));
            }
        });
    }
}
