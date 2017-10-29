package com.example.administrator.multiplefragment.base;

/**
 * Created by Administrator on 2017/10/29.
 */

public class FragmentFactory {
    public static final String MAIN_TAG = "main";
    public static final String MAP_TAG = "map";
    public static final String INFO_TAG = "info";
    public static final String MINE_TAG = "mine";


    String mainFragment;

    private static FragmentFactory mFactory;

    public static  FragmentFactory getInstance() {
        if (mFactory == null) {
            synchronized (FragmentFactory.class) {
                if (mFactory == null){
                    mFactory = new FragmentFactory();
                }
            }
        }
        return  mFactory;
    }

    public String getFragmentByTag(String tag) {
        if (tag.equals(MAIN_TAG)){
            mainFragment = "aaaa";
        }
        if (tag.equals(MAP_TAG)){

        }
        if (tag.equals(INFO_TAG)){

        }
        if (tag.equals(MINE_TAG)){

        }
        return mainFragment;
    }

}
