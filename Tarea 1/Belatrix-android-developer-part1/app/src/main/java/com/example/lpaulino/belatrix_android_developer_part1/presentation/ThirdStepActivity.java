package com.example.lpaulino.belatrix_android_developer_part1.presentation;

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

public class ThirdStepActivity extends AppCompatActivity {

    private EditText mLinesEditText;
    private Button mShowLinesButton;
    private TextView mLinesTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_step);
        mLinesEditText = (EditText) findViewById(R.id.lines_edit_text);
        mShowLinesButton = (Button) findViewById(R.id.show_lines_button);
        mLinesTextView = (TextView) findViewById(R.id.lines_text_view);
        setupListeners();
    }

    private void setupListeners() {
        mShowLinesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLinesTextView.setText("");
                try {
                    int lines = Integer.parseInt(mLinesEditText.getText().toString());
                    String text = "";
                    for (int i = 1; i <= lines; ++i) {
                        text = text.concat(String.format(getString(R.string.lines), i));
                    }
                    mLinesTextView.setText(text);
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                }
            }
        });
    }
}
