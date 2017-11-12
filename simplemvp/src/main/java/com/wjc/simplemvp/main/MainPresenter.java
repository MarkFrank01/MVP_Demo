package com.wjc.simplemvp.main;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.simplemvp.main
 * File_NAME : MainPresenter
 * Created by WJC on 2017/11/12 19:10
 * Describe : TODO
 */

public class MainPresenter implements MainContract.Presenter, MainContract.Presenter.OnFinishedListener {

    private MainContract.View mView;

    public MainPresenter(MainContract.View view) {
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void onDestroy() {
        mView = null;
    }

    @Override
    public void onResume() {
        if (mView != null) {
            mView.showProgress();
        }


        findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        if (mView != null) {
            mView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onFinished(List<String> items) {
        if (mView != null) {
            mView.setItems(items);
            mView.hideProgress();
        }
    }

    @Override
    public void findItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);
    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        );
    }
}
