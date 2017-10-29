package com.example.administrator.multiplefragment.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.administrator.multiplefragment.R;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/10/29.
 */

public class TabsFragment extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        initView();
    }

    private void initView() {

    }
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}
