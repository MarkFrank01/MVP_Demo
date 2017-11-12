package com.wjc.mvp_demo1.data;

import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.wjc.mvp_demo1.data.listeners.DataListener;
import com.wjc.mvp_demo1.data.local.PreferencesHelper;
import com.wjc.mvp_demo1.data.remote.ApiHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.data.local
 * File_NAME : DataManager
 * Created by WJC on 2017/11/12 0:34
 * Describe : TODO
 */

@Singleton
public class DataManager {

    private final PreferencesHelper mPreferencesHelper;
    private final ApiHelper mApiHelper;

    @Inject
    public DataManager(PreferencesHelper preferencesHelper, ApiHelper mApiHelper) {
        this.mPreferencesHelper = preferencesHelper;
        this.mApiHelper = mApiHelper;
    }

    public void getData(final DataListener listener){
        final String data = mPreferencesHelper.getData();

        if (data!=null){
            listener.onResponse(data);
            return;
        }

        mApiHelper.getData(new StringRequestListener() {
            @Override
            public void onResponse(String response) {
                mPreferencesHelper.putData(response);
                listener.onResponse(response);
            }

            @Override
            public void onError(ANError anError) {
                listener.onError(anError.getErrorDetail());
            }
        });
    }
}
