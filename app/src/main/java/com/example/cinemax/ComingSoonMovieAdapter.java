package com.example.cinemax;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

import java.util.ArrayList;

public class ComingSoonMovieAdapter extends ArrayAdapter<ComingSoonMovieModel> {
    public ComingSoonMovieAdapter(Context context, ArrayList<ComingSoonMovieModel> comingSoonMovieModelArrayList) {
        super(context, 0, comingSoonMovieModelArrayList);
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movie_card_coming_soon, parent, false);
        }

        ComingSoonMovieModel comingSoonModel = getItem(position);
        ImageView imageCardMovie = listItemView.findViewById(R.id.image_card_movie);
        TextView titleMovie = listItemView.findViewById(R.id.title_movie);
        TextView subTitleMovie = listItemView.findViewById(R.id.subtitle_movie);
        AppCompatButton preReleasedMovie = listItemView.findViewById(R.id.pre_released);

        imageCardMovie.setImageResource(comingSoonModel.getMovieImage());
        titleMovie.setText(comingSoonModel.getMovieName());
        subTitleMovie.setText(comingSoonModel.getMovieSubName());
        preReleasedMovie.setText("Released date | "+comingSoonModel.getReleaseDate());

        return listItemView;
    }
}
