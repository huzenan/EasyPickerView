package com.hzn.easypickerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int hour;
    private int minute;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        // hours
        initHours();

        // minutes
        initMinutes();
    }

    private void initHours() {
        EasyPickerView cpv = (EasyPickerView) findViewById(R.id.cpv1);
        final ArrayList<String> dataList = new ArrayList<>();
        String h = null;
        for (int i = 0; i < 24; i++) {
            h = i < 10 ? "0" : "";
            dataList.add("" + i);
        }
        cpv.setDataList(dataList);
        cpv.setOnScrollChangedListener(new EasyPickerView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(int curIndex) {
                hour = Integer.parseInt(dataList.get(curIndex));
                tv.setText(hour + "时" + minute + "分");
            }

            @Override
            public void onScrollFinished(int curIndex) {
                hour = Integer.parseInt(dataList.get(curIndex));
                tv.setText(hour + "时" + minute + "分");
            }
        });
    }

    private void initMinutes() {
        EasyPickerView cpv2 = (EasyPickerView) findViewById(R.id.cpv2);
        final ArrayList<String> dataList2 = new ArrayList<>();
        String m = null;
        for (int i = 0; i < 60; i++) {
            m = i < 10 ? "0" : "";
            dataList2.add("" + i);
        }
        cpv2.setDataList(dataList2);
        cpv2.setOnScrollChangedListener(new EasyPickerView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(int curIndex) {
                minute = Integer.parseInt(dataList2.get(curIndex));
                tv.setText(hour + "时" + minute + "分");
            }

            @Override
            public void onScrollFinished(int curIndex) {
                minute = Integer.parseInt(dataList2.get(curIndex));
                tv.setText(hour + "时" + minute + "分");
            }
        });
    }
}
