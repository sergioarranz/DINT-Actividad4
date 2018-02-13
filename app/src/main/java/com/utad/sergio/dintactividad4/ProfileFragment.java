package com.utad.sergio.dintactividad4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    private TextView tvProfileTitle;

    public ProfileFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        tvProfileTitle = v.findViewById(R.id.tvProfileTitle);
        tvProfileTitle.setText(R.string.title_profile_fragment);

        return v;
    }

}
