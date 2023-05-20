package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MyTicketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tickets);

        ImageButton backBtnSetting = (ImageButton) findViewById(R.id.back_btn_setting);
        backBtnSetting.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ProfileActivity.class)));

        AppCompatButton detailTicketPurchase = (AppCompatButton) findViewById(R.id.ticket1);
        detailTicketPurchase.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ThanksActivity.class)));
    }
}