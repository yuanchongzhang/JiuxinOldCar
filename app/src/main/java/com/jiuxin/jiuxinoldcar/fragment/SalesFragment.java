package com.jiuxin.jiuxinoldcar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiuxin.jiuxinoldcar.R;
import com.zcx.helper.fragment.AppV4Fragment;

/**
 * Created by Administrator on 2016/9/5.
 */
public class SalesFragment extends AppV4Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return View.inflate(getActivity(), R.layout.fragmentsale, null);

    }


    @Override
    public void setMenuVisibility(boolean menuVisible) {
        // TODO Auto-generated method stub
        super.setMenuVisibility(menuVisible);
        if(this.getView()!=null){
            this.getView().setVisibility(menuVisible?View.VISIBLE:View.GONE);
        }
    }



}
