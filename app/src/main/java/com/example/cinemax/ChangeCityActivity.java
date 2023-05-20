package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_city);

        Spinner country_list = (Spinner) findViewById(R.id.county_spinner);
        ArrayAdapter<CharSequence> adapterCountrySpinner = ArrayAdapter.createFromResource(this, R.array.list_country, android.R.layout.simple_spinner_item);
        adapterCountrySpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country_list.setAdapter(adapterCountrySpinner);

        Spinner city_list = (Spinner) findViewById(R.id.city_spinner);
        ArrayAdapter<CharSequence> adapterCitySpinner = ArrayAdapter.createFromResource(this, R.array.list_location, android.R.layout.simple_spinner_item);
        adapterCitySpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city_list.setAdapter(adapterCitySpinner);

        Spinner cinema_list = (Spinner) findViewById(R.id.cinema_spinner);
        ArrayAdapter<CharSequence> adapterCinemaSpinner = ArrayAdapter.createFromResource(this, R.array.list_location, android.R.layout.simple_spinner_item);
        adapterCinemaSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cinema_list.setAdapter(adapterCinemaSpinner);

        ImageButton backBtnSetting = (ImageButton) findViewById(R.id.back_btn_setting);
        backBtnSetting.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ProfileActivity.class)));
    }
}