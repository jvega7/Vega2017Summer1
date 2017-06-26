package com.example.jarro.vega2017summer.fragment;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jarro.vega2017summer.ActivityD;
import com.example.jarro.vega2017summer.BaseActivity;
import com.example.jarro.vega2017summer.R;


import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.jarro.vega2017summer.R.id.quiz1_submitButton;


public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }

    @OnClick(quiz1_submitButton)
    public void clickSubmit(){
            Toast.makeText(getContext(),"Thank you for submitting",Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    //Click button
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work, container, false);
        ButterKnife.bind(this, view);
        // Inflate the layout for this fragment
        return view;
    }

}
