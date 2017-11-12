package com.wjc.mvp_demo1.ui.base;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.ui.base
 * File_NAME : MvpPresenter
 * Created by WJC on 2017/11/12 13:03
 * Describe : TODO
 */

public interface MvpPresenter<V extends MvpView> {

    void attchView(V mvpView);

    void detachView();
}
