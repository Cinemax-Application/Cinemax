package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ImageButton backBtnSetting = (ImageButton) findViewById(R.id.back_btn_setting);
        backBtnSetting.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ProfileActivity.class)));
    }
}