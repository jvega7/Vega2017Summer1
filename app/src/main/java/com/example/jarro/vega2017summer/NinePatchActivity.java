package com.example.jarro.vega2017summer;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.example.jarro.vega2017summer.adapter.ScalePagerAdapter;

/**
 * Created by jarro on 6/19/2017.
 */

public class NinePatchActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ScalePagerAdapter adapter;
    private View view;




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_ninepatch);

        viewPager = (ViewPager) findViewById(R.id.activity_view_pager);


    }
}
