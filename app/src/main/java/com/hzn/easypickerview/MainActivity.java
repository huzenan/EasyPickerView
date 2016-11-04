package com.hzn.easypickerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int hour;
    private int minute;
    private TextView tv;
    private EasyPickerView cpvH;
    private EasyPickerView cpvM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        // hours
        initHours();

        // minutes
        initMinutes();

        // btns
        initBtns();
    }

    private void initHours() {
        cpvH = (EasyPickerView) findViewById(R.id.cpv1);
        final ArrayList<String> hDataList = new ArrayList<>();
        for (int i = 0; i < 24; i++)
            hDataList.add("" + i);

        cpvH.setDataList(hDataList);
        cpvH.setOnScrollChangedListener(new EasyPickerView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(int curIndex) {
                hour = Integer.parseInt(hDataList.get(curIndex));
                tv.setText(hour + "h" + minute + "m");
            }

            @Override
            public void onScrollFinished(int curIndex) {
                hour = Integer.parseInt(hDataList.get(curIndex));
                tv.setText(hour + "h" + minute + "m");
            }
        });
    }

    private void initMinutes() {
        cpvM = (EasyPickerView) findViewById(R.id.cpv2);
        final ArrayList<String> dataList2 = new ArrayList<>();
        for (int i = 0; i < 60; i++)
            dataList2.add("" + i);

        cpvM.setDataList(dataList2);
        cpvM.setOnScrollChangedListener(new EasyPickerView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(int curIndex) {
                minute = Integer.parseInt(dataList2.get(curIndex));
                tv.setText(hour + "h" + minute + "m");
            }

            @Override
            public void onScrollFinished(int curIndex) {
                minute = Integer.parseInt(dataList2.get(curIndex));
                tv.setText(hour + "h" + minute + "m");
            }
        });
    }

    private void initBtns() {
        // hours
        final EditText et_h = (EditText) findViewById(R.id.et_h);

        Button btnTo = (Button) findViewById(R.id.btn_to_h);
        btnTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(et_h.getText())) {
                    int index = Integer.parseInt(et_h.getText().toString());
                    cpvH.moveTo(index);
                }
            }
        });

        Button btnBy = (Button) findViewById(R.id.btn_by_h);
        btnBy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(et_h.getText())) {
                    int index = Integer.parseInt(et_h.getText().toString());
                    cpvH.moveBy(index);
                }
            }
        });

        // minutes
        final EditText et_m = (EditText) findViewById(R.id.et_m);

        Button btnTo_m = (Button) findViewById(R.id.btn_to_m);
        btnTo_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(et_m.getText())) {
                    int index = Integer.parseInt(et_m.getText().toString());
                    cpvM.moveTo(index);
                }
            }
        });

        Button btnBy_m = (Button) findViewById(R.id.btn_by_m);
        btnBy_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(et_m.getText())) {
                    int index = Integer.parseInt(et_m.getText().toString());
                    cpvM.moveBy(index);
                }
            }
        });
    }
}
