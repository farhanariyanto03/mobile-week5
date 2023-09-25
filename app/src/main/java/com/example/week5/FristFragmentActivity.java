package com.example.week5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FristFragmentActivity extends Fragment {

    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
//        inflate the layout for this fragment
        view = inflater.inflate(R.layout.activity_frist_fragment, container, false);
//        get the refrences of button
        firstButton = view.findViewById(R.id.firstButton);
//        perform   setOnClickListener on SecondButton
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "first fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}