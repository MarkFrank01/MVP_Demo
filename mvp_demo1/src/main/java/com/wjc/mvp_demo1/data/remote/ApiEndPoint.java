package com.wjc.mvp_demo1.data.remote;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.data.remote
 * File_NAME : ApiEndPoint
 * Created by WJC on 2017/11/12 11:51
 * Describe : TODO
 */

public final class ApiEndPoint {

    private static final String BASE_URL = "https://fierce-cove-29863.herokuapp.com";
    public static final String GET_DATA = BASE_URL + "/getAllUsers/{pageNumber}";
}
