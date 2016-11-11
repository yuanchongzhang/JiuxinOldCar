package com.jiuxin.jiuxinoldcar.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.jiuxin.jiuxinoldcar.R;

/**
 * Created by Administrator on 2016/11/11.
 */
public class TestActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.item_index);

    }
}
