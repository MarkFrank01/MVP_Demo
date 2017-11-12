package com.wjc.mvp_demo1.ui.base;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.ui.base
 * File_NAME : BasePresenter
 * Created by WJC on 2017/11/12 13:11
 * Describe : TODO
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    @Override
    public void attchView(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    public boolean isViewAttached(){
        return mMvpView != null;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
