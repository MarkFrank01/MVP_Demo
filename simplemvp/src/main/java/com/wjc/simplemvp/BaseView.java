package com.wjc.simplemvp;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.simplemvp
 * File_NAME : BaseView
 * Created by WJC on 2017/11/12 16:04
 * Describe : TODO
 */

public interface BaseView<T>{

    void setPresenter(T presenter);

    void showProgress();

    void hideProgress();

}
