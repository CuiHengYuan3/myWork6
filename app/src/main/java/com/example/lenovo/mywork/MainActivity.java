package com.example.lenovo.mywork;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
//private List<fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);

         List<Fragment> fragmentList = new ArrayList<>();
         List<String> titleList = new ArrayList<>();

        TabLayout tabLayout;
         ViewPager viewPager;

     /  tabLayout =  this.findViewById(R.id.tablayout);
        viewPager =  this.findViewById(R.id.viewpage);







   }
}
