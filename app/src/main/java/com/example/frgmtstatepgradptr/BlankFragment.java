package com.example.frgmtstatepgradptr;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    TextView textView;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_blank, container, false );
        textView = view.findViewById( R.id.message );
        String msg = getArguments().getString( "message" );
        textView.setText( msg );
        return  view;
    }

}
