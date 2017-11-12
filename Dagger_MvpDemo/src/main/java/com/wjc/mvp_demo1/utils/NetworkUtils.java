package com.wjc.mvp_demo1.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.utils
 * File_NAME : NetworkUtils
 * Created by WJC on 2017/11/11 21:45
 * Describe : TODO
 */

public final class NetworkUtils {

    private NetworkUtils(){
        // This utility class is not publicly instantiable
    }

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}
