package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class DetailMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        ImageButton backBtnSetting = (ImageButton) findViewById(R.id.back_btn_setting);
        backBtnSetting.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ContainerMainActivity.class)));

        AppCompatButton bookingBtn = (AppCompatButton) findViewById(R.id.booking_btn);
        bookingBtn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), SelectDateActivity.class)));
    }
}