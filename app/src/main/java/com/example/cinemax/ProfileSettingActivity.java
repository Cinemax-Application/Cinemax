package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setting);

        ImageButton backBtnSetting = (ImageButton) findViewById(R.id.back_btn_setting);
        backBtnSetting.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ProfileActivity.class)));
    }
}