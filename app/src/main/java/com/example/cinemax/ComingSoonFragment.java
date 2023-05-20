package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class ComingSoonFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_coming_soon, container, false);

        // Spinner
        Spinner location_list = (Spinner) v.findViewById(R.id.location_list);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this.getActivity(), R.array.list_location, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        location_list.setAdapter(adapterSpinner);

        // onclick profile image button
        ImageButton profileBtn = (ImageButton) v.findViewById(R.id.profile_btn);
        profileBtn.setOnClickListener(v1 -> startActivity(new Intent(requireContext(), ProfileActivity.class)));

        // GridView
        GridView coming_soon_grid = v.findViewById(R.id.comingsoon_grid);
        ArrayList<ComingSoonMovieModel> comingSoonMovieModelArrayList = new ArrayList<>();

        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Moonfall", "", R.drawable.moonfall, "Feb, 8 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Belfast", "", R.drawable.belfast, "May, 2 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Los ojos de \nTammy Faye", "", R.drawable.los_ojo_de, "Apr, 23 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Spiderman", "Far from home", R.drawable.spiderman, "Jun, 4 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Cyrano", "", R.drawable.cyrano, "Nov, 28 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Muarte en el nilo", "", R.drawable.el_nilo, "Dec, 28 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Paris", "Distrito", R.drawable.paris, "Dec 28 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Wakanda", "forever", R.drawable.wakanda, "Dec, 28 2023"));

        ComingSoonMovieAdapter adapter = new ComingSoonMovieAdapter(this.getContext(), comingSoonMovieModelArrayList);
        coming_soon_grid.setAdapter(adapter);

        return v;
    }
}