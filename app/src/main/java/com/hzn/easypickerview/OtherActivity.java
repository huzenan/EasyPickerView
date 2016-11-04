package com.hzn.easypickerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;

public class OtherActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        initViews();
    }

    private void initViews() {
        ArrayList<String> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            dataList.add("" + i);

        EasyPickerView epv = (EasyPickerView) findViewById(R.id.epv);
        epv.setDataList(dataList);
    }
}
