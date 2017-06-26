package com.example.jarro.vega2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 * Created by jarro on 6/20/2017.
 */

public class BaseActivity extends AppCompatActivity {
    //Common Method Toast
    public void showToast(String s){Toast.makeText(this,s, Toast.LENGTH_SHORT).show();}
    public void shortToast(String s){
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
    }
    public void longtToast(String s){
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }
    public void goToActivity(Class c){
        Intent  intent = new Intent(this,c);
        startActivity(intent);
    }

}

