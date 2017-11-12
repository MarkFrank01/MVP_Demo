package com.wjc.mvp_demo1.ui.main;

import com.wjc.mvp_demo1.data.DataManager;
import com.wjc.mvp_demo1.data.listeners.DataListener;
import com.wjc.mvp_demo1.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.ui.main
 * File_NAME : MainPresenter
 * Created by WJC on 2017/11/12 13:53
 * Describe : TODO
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    private final DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getData() {
        getMvpView().showLoading();

        mDataManager.getData(new DataListener() {
            @Override
            public void onResponse(String data) {
                getMvpView().hideLoading();
                getMvpView().showData(data);
            }

            @Override
            public void onError(String error) {
                getMvpView().hideLoading();
                getMvpView().showData(error);
            }
        });
    }
}
