package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFirstFragment, btnSecondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirstFragment = (Button) findViewById(R.id.firstFargment);
        btnSecondFragment = (Button) findViewById(R.id.secondFragment);
        btnFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                LOAD FIRST FRAGMENT
                loadFragment(new FristFragmentActivity());
            }
        });
        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                LOAD SECOND FRAGMENT
                loadFragment(new SecondFragmentActivity()
                );
            }
        });
    }

    private void loadFragment(Fragment fragment){
//        CREATE FRAGMENT MANAGER
        FragmentManager fm = getFragmentManager();
//        create fragment transaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
//        replace the framelayout with new fragment
        fragmentTransaction.replace(R.id.framLayout, fragment);
        fragmentTransaction.commit();//save the change
    }
}