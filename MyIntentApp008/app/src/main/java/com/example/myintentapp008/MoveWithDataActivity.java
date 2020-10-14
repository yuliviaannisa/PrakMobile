package com.example.myintentapp008;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    public static String EXTRA_AGE = "extra_age";
    public static String EXTRA_NAME = "extra_name";
    private TextView tvDataReceieved;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataReceieved=(TextView)findViewById(R.id.tv_data_received);
        String name =getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent(). getIntExtra(EXTRA_AGE,0);
        String text = "Name : "+name+", Your Age "+age;
        tvDataReceieved.setText(text);

    }
}