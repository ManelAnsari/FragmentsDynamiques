package com.example.fragmentsdynamiques;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
Fragmentwo fragtwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
            fragtwo=new Fragmentwo();
            transaction.add(R.id.frame_frag2, fragtwo);
            transaction.commit();
    }
    @Override
    public void onResume() {
        super.onResume();
        // Call update method here because we are sure that Fragmentwo is visible
        String e1 = getIntent().getStringExtra("msg");
        String e2 = getIntent().getStringExtra("msg1");
        // Update DetailFragment's TextView
        Integer c=Integer.valueOf(e1)+ Integer.valueOf(e2);
        fragtwo.updateTextView(c);
    }
}
