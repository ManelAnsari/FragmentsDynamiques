package com.example.fragmentsdynamiques;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentwo extends Fragment {
TextView x;
    public Fragmentwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragmentwo, container, false);
       // View v= inflater.inflate(R.layout.fragment_fragmentwo, container, false);
        this.x = v.findViewById(R.id.res);
        return v;
    }
    // 3 - Update TextView
    public void updateTextView(Integer x){
        this.x.setText(x.toString());
    }
}
