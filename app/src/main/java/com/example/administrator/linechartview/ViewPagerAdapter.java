package com.example.administrator.linechartview;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    private List<View>mViewList;
    private List<String>mTitleList;
    public ViewPagerAdapter(List<View>mViewList,List<String>mTitleList){
        this.mTitleList=mTitleList;
        this.mViewList=mViewList;
    }
    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }
    @Override
    public Object instantiateItem(ViewGroup container,int position){
        container.addView(mViewList.get(position));
        return mViewList.get(position);
    }
    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView(mViewList.get(position));
    }
    @Override
    public CharSequence getPageTitle(int position){
        return mTitleList.get(position);
    }
}
