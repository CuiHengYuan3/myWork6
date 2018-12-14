package com.example.lenovo.mywork;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class tablayoutAdapter  extends FragmentPagerAdapter {

    //Fragment集合
    private List<Fragment> listFragment;
    //Tab名称集合
    private List<String> listTitle;


    public tablayoutAdapter(FragmentManager fm,List<Fragment> listF,List<String> listS) {
        super(fm);
        listFragment = listF;
        listTitle = listS;

    }

    @Override
    public Fragment getItem(int i) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position);
    }

}
