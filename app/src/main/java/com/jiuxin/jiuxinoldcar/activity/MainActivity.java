package com.jiuxin.jiuxinoldcar.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.jiuxin.jiuxinoldcar.R;
import com.jiuxin.jiuxinoldcar.fragment.HomeFragment;
import com.jiuxin.jiuxinoldcar.fragment.PurchaseCarFragment;
import com.jiuxin.jiuxinoldcar.fragment.SalesFragment;
import com.jiuxin.jiuxinoldcar.fragment.TreasureBoxFragment;

/**
 * Created by Administrator on 2016/11/10.
 */
public class MainActivity extends FragmentActivity {

    private Boolean FLAG = false;

    RadioGroup radioGroup;

    RadioButton city_tugou;


    FrameLayout layout_frame;

    public RadioButton rb_travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int index = 0;
                switch (i) {
                    case R.id.rb_home:
                        index = 10;
                        break;
                    case R.id.rb_travel:
                        index = 20;
                        break;
                    case R.id.rb_service:
                        index = 30;
                        break;
                    case R.id.rb_my:
                        index = 40;
                        break;

                }
                Fragment fragment = (Fragment) fragmentAdapter.instantiateItem(layout_frame, index);
                fragmentAdapter.setPrimaryItem(layout_frame, 0, fragment);
             fragmentAdapter.finishUpdate(layout_frame);
            }
        });
    }

    public void bindView() {
        radioGroup = (RadioGroup) findViewById(R.id.rg_bottomm);
        city_tugou = (RadioButton) findViewById(R.id.rb_home);
        layout_frame = (FrameLayout) findViewById(R.id.fl_content);
        rb_travel= (RadioButton) findViewById(R.id.rb_travel);
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        // TODO Auto-generated method stub
        super.onWindowFocusChanged(hasFocus);
        if (!FLAG) {
            city_tugou.setChecked(true);
            FLAG = true;
        }
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();

    }

    FragmentStatePagerAdapter fragmentAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

        @Override
        public Fragment getItem(int arg0) {
            // TODO Auto-generated method stub
            switch (arg0) {
                case 10:
                    return new HomeFragment();
                case 20:
                    return new PurchaseCarFragment();
                case 30:
                    return new SalesFragment();
                case 40:
                    return new TreasureBoxFragment();

                default:
                    return new HomeFragment();
            }

        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 4;
        }

    };
}
