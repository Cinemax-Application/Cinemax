package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button signin_btn = (Button) findViewById(R.id.signin_btn);
        signin_btn.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ContainerMainActivity.class)));
    }
}