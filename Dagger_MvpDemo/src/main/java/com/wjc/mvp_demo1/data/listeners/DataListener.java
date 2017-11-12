package com.wjc.mvp_demo1.data.listeners;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.data.listeners
 * File_NAME : DataListener
 * Created by WJC on 2017/11/12 11:41
 * Describe : TODO
 */

public interface DataListener {

    void onResponse(String data);

    void onError(String error);
}
