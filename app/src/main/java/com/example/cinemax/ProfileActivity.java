package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        AppCompatButton logoutBtn = (AppCompatButton) findViewById(R.id.logout_btn);
        logoutBtn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), MainActivity.class)));

        ImageButton settingBtn = (ImageButton) findViewById(R.id.setting_btn);
        settingBtn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ProfileSettingActivity.class)));

        AppCompatButton changeCityBtn = (AppCompatButton) findViewById(R.id.change_city_btn);
        changeCityBtn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ChangeCityActivity.class)));

        ImageButton backBtnSetting = (ImageButton) findViewById(R.id.back_btn_setting);
        backBtnSetting.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ContainerMainActivity.class)));

        AppCompatButton ticketBtn = (AppCompatButton) findViewById(R.id.my_ticket_btn);
        ticketBtn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), MyTicketsActivity.class)));

        AppCompatButton historyBtn = (AppCompatButton) findViewById(R.id.history_btn);
        historyBtn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), HistoryActivity.class)));
    }
}