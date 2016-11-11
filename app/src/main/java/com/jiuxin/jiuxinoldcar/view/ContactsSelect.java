package com.jiuxin.jiuxinoldcar.view;

import android.content.Context;
import android.util.AttributeSet;

import com.jiuxin.jiuxinoldcar.R;
import com.zcx.helper.view.AppCheck;

/**
 * Created by Administrator on 2016/10/24.
 */
public class ContactsSelect extends AppCheck {

    public ContactsSelect(Context context, AttributeSet attrs) {

        super(context, attrs);

    }

    @Override
    protected boolean getOnClick() {

        return false;

    }


    @Override
    protected int getCheckYes() {

        return R.mipmap.contacts_select_on;

    }

    @Override
    protected int getCheckNo() {

        return R.mipmap.contacts_select_off;

    }

}
