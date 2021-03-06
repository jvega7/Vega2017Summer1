package com.example.jarro.vega2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.jarro.vega2017summer.ActivityA;
import com.example.jarro.vega2017summer.AdvanceListViewActivity;
import com.example.jarro.vega2017summer.CheckBoxActivity;
import com.example.jarro.vega2017summer.DialogActivity;
import com.example.jarro.vega2017summer.NinePatchActivity;
import com.example.jarro.vega2017summer.NotificationActivity;
import com.example.jarro.vega2017summer.R;
import com.example.jarro.vega2017summer.ResultActivity;
import com.example.jarro.vega2017summer.ScaleTypeActivity;
import com.example.jarro.vega2017summer.ViewPagerActivity;
import com.example.jarro.vega2017summer.adapter.ListNormalAdapter;
import com.example.jarro.vega2017summer.audio.BaseBean;
import com.example.jarro.vega2017summer.video.RadioGroupActivity;

import java.util.ArrayList;


public class DemoFragment extends Fragment {
    private final ArrayList<String> contentList;
    private final Context context;
    private ListView listView;

    public DemoFragment() {
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("ActivityA");
        contentList.add("ActivityResult");
        contentList.add("RadioButton");
        contentList.add("CheckBox");
        contentList.add("Dialog");
        contentList.add("H");
        contentList.add("I");
        contentList.add("J");
        contentList.add("K");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                      Intent intent2 = new Intent(getActivity(), NinePatchActivity.class);
                      startActivity(intent2);
                       break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), NotificationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), ActivityA.class);//
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), ResultActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), RadioGroupActivity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), CheckBoxActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), DialogActivity.class);
                        startActivity(intent9);
                        break;
                    default:
                }
            }
        });
        return view;
    }

}
