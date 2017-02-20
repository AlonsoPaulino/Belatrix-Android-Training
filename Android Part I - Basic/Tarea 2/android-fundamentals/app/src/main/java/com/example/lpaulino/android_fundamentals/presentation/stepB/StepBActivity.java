package com.example.lpaulino.android_fundamentals.presentation.stepB;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lpaulino.android_fundamentals.R;
import com.example.lpaulino.android_fundamentals.presentation.stepC.StepCActivity;
import com.example.lpaulino.android_fundamentals.presentation.stepD.StepDActivity;
import com.example.lpaulino.android_fundamentals.presentation.stepE.StepEActivity;

/**
 * Created by lpaulino on 18/01/17.
 */

public class StepBActivity extends AppCompatActivity {

    private Button mNextCButton;
    private Button mNextDButton;
    private Button mNextEButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_b);
        mNextCButton = (Button) findViewById(R.id.next_c);
        mNextDButton = (Button) findViewById(R.id.next_d);
        mNextEButton = (Button) findViewById(R.id.next_e);
        mNextCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StepBActivity.this, StepCActivity.class));
            }
        });
        mNextDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StepBActivity.this, StepDActivity.class));
            }
        });
        mNextEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StepBActivity.this, StepEActivity.class));
            }
        });
    }
}
