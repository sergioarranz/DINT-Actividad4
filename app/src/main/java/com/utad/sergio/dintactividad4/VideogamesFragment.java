package com.utad.sergio.dintactividad4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VideogamesFragment extends Fragment {

    private TextView tvVideogamesTitle;

    public VideogamesFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_videogames, container, false);

        tvVideogamesTitle = v.findViewById(R.id.tvVideogamesTitle);
        tvVideogamesTitle.setText(R.string.title_videogames_fragment);

        return v;
    }
}
