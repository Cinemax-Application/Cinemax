package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), SignInActivity.class);
            startActivity(intent);
        });

        Button signup_btn = (Button) findViewById(R.id.signup_btn);
        signup_btn.setOnClickListener(v -> {
            Intent billboard_intent = new Intent(v.getContext(), ContainerMainActivity.class);
            startActivity(billboard_intent);
        });
    }
}