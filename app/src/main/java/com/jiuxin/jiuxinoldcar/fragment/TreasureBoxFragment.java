package com.jiuxin.jiuxinoldcar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiuxin.jiuxinoldcar.R;
import com.zcx.helper.fragment.AppV4Fragment;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/11/9.
 */
public class TreasureBoxFragment extends AppV4Fragment implements View.OnClickListener {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_sy, null);

        return view;


    }


    @Override
    public void setMenuVisibility(boolean menuVisible) {
        // TODO Auto-generated method stub
        super.setMenuVisibility(menuVisible);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisible ? View.VISIBLE : View.GONE);
        }
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @Override
    public void onClick(View view) {

    }
}
