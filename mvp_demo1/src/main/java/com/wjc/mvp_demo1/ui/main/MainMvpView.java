package com.wjc.mvp_demo1.ui.main;

import com.wjc.mvp_demo1.ui.base.MvpView;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.ui.main
 * File_NAME : MainMvpView
 * Created by WJC on 2017/11/12 13:45
 * Describe : TODO
 */

public interface MainMvpView extends MvpView{

    void showData(String data);

    void showError(String error);
}
