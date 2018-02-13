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
public class InboxFragment extends Fragment {

    private TextView tvInboxTitle;

    public InboxFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_inbox, container, false);

        tvInboxTitle = v.findViewById(R.id.tvInboxTitle);
        tvInboxTitle.setText(R.string.title_inbox_fragment);

        return v;
    }

}
