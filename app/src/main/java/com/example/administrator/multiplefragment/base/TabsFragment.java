package com.example.administrator.multiplefragment.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import com.example.administrator.multiplefragment.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/10/29.
 */

public class TabsFragment extends BaseFragment implements View.OnClickListener {
    @Bind(R.id.fragment_tab)
    FrameLayout frameLayout;
    @Bind(R.id.tab_group)
    RadioGroup tabGroup;
    @Bind(R.id.main_tab)
    RadioButton mainTab;
    @Bind(R.id.map_tab)
    RadioButton mapTab;
    @Bind(R.id.info_tab)
    RadioButton infoTab;
    @Bind(R.id.mine_tab)
    RadioButton mineTab;

    private  FragmentFactory mFactory;
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
        mainTab.setChecked(true);
        mFactory = FragmentFactory.getInstance();
        mainTab.setOnClickListener(this);
        mapTab.setOnClickListener(this);
        infoTab.setOnClickListener(this);
        mineTab.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_tab:
                Toast.makeText(getContext(), "main_tab", Toast.LENGTH_SHORT).show();
                break;
            case R.id.map_tab:
                Toast.makeText(getContext(), "map_tab", Toast.LENGTH_SHORT).show();
                break;
            case R.id.info_tab:
                Toast.makeText(getContext(), "info_tab", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mine_tab:
                Toast.makeText(getContext(), "mine_tab", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void initFragment(String tag) {
        String baseFragment = mFactory.getFragmentByTag(tag);
    }

    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}
