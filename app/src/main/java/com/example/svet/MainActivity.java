package com.example.svet;

import static com.example.svet.R.id.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView Info;
    public ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        Info = (TextView) findViewById(R.id.textView);
    }

    public void buttonRedClick(View view) {
        Info.setText(R.string.red);
        constraintLayout.setBackgroundResource(R.color.redColor);
    }
    public void buttonYellowClick(View view) {
        Info.setText(R.string.yellow);
        constraintLayout.setBackgroundResource(R.color.yellowColor);
    }
    public void buttonGreenClick(View view) {
        Info.setText(R.string.green);
        constraintLayout.setBackgroundResource(R.color. greenColor);
    }
}