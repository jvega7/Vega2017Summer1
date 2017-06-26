package com.example.jarro.vega2017summer;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Toast;

import com.example.jarro.vega2017summer.audio.BaseBean;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jarro on 6/20/2017.
 */

public class ActivityA extends  BaseActivity  {


    @OnClick(R.id.button_a_a)
    public void clickA(View v){
        Toast.makeText(this,"ClickA",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_a);
        Intent intentA = new Intent(this, ActivityA.class);//
        startActivity(intentA);

    }
    @OnClick(R.id.button_a_b)
    public void clickB(View v){
        Toast.makeText(this,"ClickB",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_b);
        Intent intentA = new Intent(this, ActivityB.class);//
        startActivity(intentA);
    }
    @OnClick(R.id.button_a_c)
    public void clickC(View v){
        Toast.makeText(this,"ClickC",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_c);
        Intent intentA = new Intent(this, ActivityC.class);//
        startActivity(intentA);
    }
    @OnClick(R.id.button_a_d)
    public void clickD(View v){
        Toast.makeText(this,"ClickD",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_d);
        Intent intentA = new Intent(this, ActivityD.class);//
        startActivity(intentA);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        showToast("onCreate");
    }
//

}
