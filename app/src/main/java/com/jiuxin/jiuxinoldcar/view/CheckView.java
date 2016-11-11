package com.jiuxin.jiuxinoldcar.view;

import android.content.Context;
import android.util.AttributeSet;

import com.jiuxin.jiuxinoldcar.R;
import com.zcx.helper.view.AppCheck;

/**
 * Created by Administrator on 2016/10/12.
 */
public class CheckView extends AppCheck {

    public CheckView(Context context, AttributeSet attrs) {

        super(context, attrs);

    }

    @Override
    protected boolean getOnClick() {

        return false;

    }

    @Override
    protected int getCheckYes() {

        return R.mipmap.check_on;

    }

    @Override
    protected int getCheckNo() {

        return R.mipmap.check_off;

    }

}
