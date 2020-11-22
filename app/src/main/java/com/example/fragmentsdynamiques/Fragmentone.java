package com.example.fragmentsdynamiques;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentone extends Fragment {
Button btn;
EditText a,b;
    private OnButtonClickedListener mCallback;
    public Fragmentone() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragmentone, container, false);
        btn=v.findViewById(R.id.btn);
        a=v.findViewById(R.id.entier1);
        b=v.findViewById(R.id.entier2);
// btn click listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mCallback.onButtonClicked(a, b);
            }
        });
        return v;
    }
    public interface OnButtonClickedListener {
        public void onButtonClicked(View a, View b);
    }
    private void createCallbackToParentActivity() {
try {
        //Parent activity will automatically subscribe to callback
        mCallback = (OnButtonClickedListener) getActivity();
    } catch (ClassCastException e) {
        throw new ClassCastException(e.toString() + " must implement OnButtonClickedListener");
    }}
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // 4 - Call the method that creating callback after being attached to parent activity
        this.createCallbackToParentActivity();
    }
}
