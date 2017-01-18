package com.example.lpaulino.android_fundamentals.presentation.stepA;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.lpaulino.android_fundamentals.R;
import com.example.lpaulino.android_fundamentals.data.ImagesDataSource;
import com.example.lpaulino.android_fundamentals.presentation.stepB.StepBActivity;

public class StepAActivity extends AppCompatActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_a);
        mGridView = (GridView) findViewById(R.id.images_grid_view);
        mGridView.setAdapter(new ImagesAdapter(this, ImagesDataSource.getInstance().getChristmasImages()));
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(StepAActivity.this, StepBActivity.class));
            }
        });
    }
}
