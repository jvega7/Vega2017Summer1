package com.example.jarro.vega2017summer;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.example.jarro.vega2017summer.adapter.ScalePagerAdapter;

import java.util.ArrayList;

/**
 * Created by jarro on 6/18/2017.
 */

public class ScaleTypeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ScalePagerAdapter adapter;
    private View view1,view2,view3,view4,view5,view6,view7,view8;
    private ArrayList<View> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Had to set cause did not have an view pager to allow user to swipe left and right in :
        setContentView(R.layout.activity_scale_type);
        //setContentView(R.layout.activity_view_pager);


        list = new ArrayList<View>();
        //viewPager = (ViewPager) findViewById(R.id.activity_view_pager);
        viewPager = (ViewPager) findViewById(R.id.activity_scale_view_pager);
        LayoutInflater lf = getLayoutInflater().from(this);
        view1 = lf.inflate(R.layout.view_scale_centerinside,null);
        view2 = lf.inflate(R.layout.view_scale_center,null);
        view3 = lf.inflate(R.layout.view_scale_centercrop,null);
        view4 = lf.inflate(R.layout.view_scale_matrix,null);
        view5 = lf.inflate(R.layout.view_scale_fitcenter,null);
        view6 = lf.inflate(R.layout.view_scale_fitstart,null);
        view7 = lf.inflate(R.layout.view_scale_fitend,null);
        view8 = lf.inflate(R.layout.view_scale_fitxy,null);

        list.add(view1);
        list.add(view2);
        list.add(view3);
        list.add(view4);
        list.add(view5);
        list.add(view6);
        list.add(view7);
        list.add(view8);
        adapter = new ScalePagerAdapter(list);
        viewPager.setAdapter(adapter);

    }
}
