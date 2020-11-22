package com.example.fragmentsdynamiques;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Fragmentone.OnButtonClickedListener {
Fragmentone fragone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragone=new Fragmentone();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //Show fragmentone
        fragone=new Fragmentone();
        transaction.add(R.id.frame_frag1, fragone);
        //If it’s tablet show fragmentwo
       /* if (findViewById(R.id.frame_frag2) != null)
        { fragmentwo=new Fragmentwo();
            transaction.add(R.id.frame_frag2, fragmentwo);
        }*/
        transaction.commit();
    }

    @Override
    public void onButtonClicked(View view, View k) {
        Intent i=new Intent(this, Main2Activity.class);
        i.putExtra("msg", fragone.a.getText().toString());
        i.putExtra("msg1", fragone.b.getText().toString());
        startActivity(i);
    }
}
