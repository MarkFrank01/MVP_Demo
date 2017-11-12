package com.wjc.mvp_demo1.ui.main;

import com.wjc.mvp_demo1.ui.base.MvpPresenter;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.ui.main
 * File_NAME : MainMvpPresenter
 * Created by WJC on 2017/11/12 13:46
 * Describe : TODO
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V>{

    void  getData();
}
