package com.example.jarro.vega2017summer.video;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import com.example.jarro.vega2017summer.BaseActivity;
import com.example.jarro.vega2017summer.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jarro on 6/21/2017.
 */

public class RadioGroupActivity extends BaseActivity {
        private int checkedID;

        @BindView(R.id.activity_radio_group)
        RadioGroup radioGroup;

        @OnClick(R.id.activity_radio_group_submit)
        public void submit(View view){
            shortToast("You choose Radiobutton" + checkedID);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_radio_group);
            ButterKnife.bind(this);
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
                @Override
                public void onCheckedChanged(RadioGroup group, @IdRes int checkedId){
                    checkedID = checkedId;
                }
            });
        }
}

