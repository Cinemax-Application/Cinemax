package com.example.cinemax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class ThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        AppCompatButton returnBtn = (AppCompatButton) findViewById(R.id.return_btn);
        returnBtn.setOnClickListener(v -> startActivity(new Intent(this, ContainerMainActivity.class)));
    }
}