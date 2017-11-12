package com.wjc.mvp_demo1.data.remote;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interfaces.StringRequestListener;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.data.remote
 * File_NAME : ApiHelper
 * Created by WJC on 2017/11/12 11:52
 * Describe : TODO
 */

@Singleton
public class ApiHelper {

    @Inject
    public ApiHelper(){

    }

    public void getData(StringRequestListener listener){
        AndroidNetworking.get(ApiEndPoint.GET_DATA)
                .addPathParameter("pageNumber","0")
                .addQueryParameter("limit","3")
                .build()
                .getAsString(listener);
    }
}
