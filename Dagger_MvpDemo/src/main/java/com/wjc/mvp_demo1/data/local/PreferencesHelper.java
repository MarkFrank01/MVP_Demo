package com.wjc.mvp_demo1.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import com.wjc.mvp_demo1.injection.annotation.ApplicationContent;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.data.local
 * File_NAME : PreferencesHelper
 * Created by WJC on 2017/11/12 11:42
 * Describe : TODO
 */

@Singleton
public class PreferencesHelper {

    private static final String PREF_FILE_NAME = "pref_file";
    private static final String DATA = "DATA";
    private final SharedPreferences mPref;

    @Inject
    public PreferencesHelper(@ApplicationContent Context context){
        mPref = context.getSharedPreferences(PREF_FILE_NAME,Context.MODE_PRIVATE);

    }

    public void clear(){
        mPref.edit().clear().apply();
    }

    public void putData(String data){
        mPref.edit().putString(DATA,data);
    }

    public String getData(){
        return mPref.getString(DATA,null);
    }
}
