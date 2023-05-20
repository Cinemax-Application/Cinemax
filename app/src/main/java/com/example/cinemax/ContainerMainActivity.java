package com.example.cinemax;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContainerMainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    BillboardFragment billboardFragment = new BillboardFragment();
    ComingSoonFragment comingSoonFragment = new ComingSoonFragment();
    EventFragment eventFragment = new EventFragment();

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setItemIconTintList(null);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, billboardFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.billboard:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, billboardFragment).commit();
                    return true;
                case R.id.comingsoon:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, comingSoonFragment).commit();
                    return true;
                case R.id.event:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container, eventFragment).commit();
                    return true;
                case R.id.profile:
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
            }

            return false;
        });

    }
}