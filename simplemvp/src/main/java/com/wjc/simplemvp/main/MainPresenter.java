package com.wjc.simplemvp.main;

public interface MainPresenter {

    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
