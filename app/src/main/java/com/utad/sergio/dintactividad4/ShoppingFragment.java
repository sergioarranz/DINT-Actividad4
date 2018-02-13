package com.utad.sergio.dintactividad4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {

    private TextView tvShoppingTitle;

    public ShoppingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_shopping, container, false);

        tvShoppingTitle = v.findViewById(R.id.tvShoppingTitle);
        tvShoppingTitle.setText(R.string.title_shopping_fragment);

        return v;
    }

}
