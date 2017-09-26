package com.bkdn.maihuong.ex_viewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab) ;

        CustomViewPagerAdapter customViewPagerAdapter = new CustomViewPagerAdapter(getSupportFragmentManager());
        customViewPagerAdapter.addData(new Fragment1(), "Introduce");
        customViewPagerAdapter.addData(new Fragment2(), "Film");
        customViewPagerAdapter.addData(new Fragment3(), "Song");
        viewPager.setAdapter(customViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
