package com.jiuxin.jiuxinoldcar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.jiuxin.jiuxinoldcar.R;
import com.jiuxin.jiuxinoldcar.adapter.FragmentIndexAdapter;
import com.jiuxin.jiuxinoldcar.banner.BannerLayout;
import com.jiuxin.jiuxinoldcar.view.ADView;
import com.zcx.helper.fragment.AppV4Fragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/9/5.
 */
public class HomeFragment extends AppV4Fragment implements View.OnClickListener {


    ADView ad_ad_view;

    TextView jumpto_puraseFragment;


    RecyclerView xianshirecycleview;

    FragmentIndexAdapter mAdapter;

    private List<Integer> mDatas;

    PurchaseCarFragment purchaseCarFragment;

    private OnButtonClick onButtonClick;

    RecyclerView hotpinpan;

    RecyclerView tbndfnsadf;
    BannerLayout banner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.fragmenthome, null);


        jumpto_puraseFragment = (TextView) view.findViewById(R.id.jumpto_puraseFragment);
        tbndfnsadf = (RecyclerView) view.findViewById(R.id.tbndfnsadf);
        jumpto_puraseFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   if(onButtonClick!=null){
                    onButtonClick.onClick(jumpto_puraseFragment);
                }*/

                changeToAnotherFragment();
                Toast.makeText(getActivity(), "heheh", Toast.LENGTH_SHORT).show();
            }
        });


        xianshirecycleview = (RecyclerView) view.findViewById(R.id.xianshirecycleview);
        hotpinpan = (RecyclerView) view.findViewById(R.id.hotpinpan);
        banner = (BannerLayout) view.findViewById(R.id.banner2);

    /*    final List<String> urls = new ArrayList<>();
        urls.add("http://m2.quanjing.com/2m/fod_liv002/fo-11171537.jpg");
        urls.add("http://pic55.nipic.com/file/20141208/19462408_171130083000_2.jpg");
        urls.add("http://pic33.nipic.com/20130916/3420027_192919547000_2.jpg");
        urls.add("http://img05.tooopen.com/images/20140604/sy_62331342149.jpg");
        urls.add("http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
        banner.setViewUrls(urls);*/

        //低于三张
        final List<String> urls2 = new ArrayList<>();
        urls2.add("http://img05.tooopen.com/images/20140604/sy_62331342149.jpg");
        urls2.add("http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
        banner.setViewUrls(urls2);
        initDatas();
        initData();
        return view;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.jumpto_puraseFragment:
                //jumpto_puraseFragment.setOnClickListener(lyricShowListener);
                // ((MainActivity) getActivity())..setChecked(true);
                // (MainActivity)getActivity().rb_travel.setChecked(true);
//                if(onButtonClick!=null){
//                    onButtonClick.onClick(jumpto_puraseFragment);
//                }
                changeToAnotherFragment();
                break;

        }
    }

    private void changeToAnotherFragment() {
        //如果是用的v4的包，则用getActivity().getSuppoutFragmentManager();
        android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
        //注意v4包的配套使用
        Fragment fragment = new PurchaseCarFragment();
        //   fm.beginTransaction().replace(R.id.navigation_content,fragment).commit();
    }

    public void initData() {
        purchaseCarFragment = new PurchaseCarFragment();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        xianshirecycleview.setLayoutManager(linearLayoutManager);
        mAdapter = new FragmentIndexAdapter(getActivity(), mDatas);
        xianshirecycleview.setAdapter(mAdapter);


        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getActivity());
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        hotpinpan.setLayoutManager(linearLayoutManager2);
        FragmentIndexAdapter mAdapter = new FragmentIndexAdapter(getActivity(), mDatas);
        hotpinpan.setAdapter(mAdapter);


        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getActivity());
        linearLayoutManager3.setOrientation(LinearLayoutManager.VERTICAL);
        tbndfnsadf.setLayoutManager(linearLayoutManager3);
        FragmentIndexAdapter mAdapter2 = new FragmentIndexAdapter(getActivity(), mDatas);
        tbndfnsadf.setAdapter(mAdapter2);


/*
        List<String> list = new ArrayList<>();
        list.add("http://img0.imgtn.bdimg.com/it/u=2814045039,772110411&fm=21&gp=0.jpg");
        list.add("http://pic.58pic.com/58pic/16/61/49/65d58PICvQf_1024.jpg");
        list.add("http://pic39.nipic.com/20140308/2656254_131632622000_2.jpg");
        list.add("http://www.jxzyw.com/kejizuopin/201410/41337CDE29CD7AC3.jpg");
        list.add("http://pic39.nipic.com/20140308/2656254_131632622000_2.jpg");
        list.add("http://www.jxzyw.com/kejizuopin/201410/41337CDE29CD7AC3.jpg");
        ad_ad_view.setItemList(list);*/

    }

    private void initDatas() {
        mDatas = new ArrayList<Integer>(Arrays.asList(R.mipmap.ic_launcher,
                R.mipmap.jumptopurse, R.mipmap.jumptopurse, R.mipmap.jumptopurse, R.mipmap.jumptopurse,
                R.mipmap.jumptopurse, R.mipmap.jumptopurse, R.mipmap.jumptopurse, R.mipmap.jumptopurse));
    }


    public OnButtonClick getOnButtonClick() {
        return onButtonClick;
    }

    public void setOnButtonClick(OnButtonClick onButtonClick) {
        this.onButtonClick = onButtonClick;
    }

    public interface OnButtonClick {
        public void onClick(View view);
    }


    @Override
    public void setMenuVisibility(boolean menuVisible) {
        // TODO Auto-generated method stub
        super.setMenuVisibility(menuVisible);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisible ? View.VISIBLE : View.GONE);
        }
    }

}
