package com.wjc.mvp_demo1.injection.module;

import android.app.Activity;
import android.content.Context;

import com.wjc.mvp_demo1.injection.annotation.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.injection.module
 * File_NAME : ActivityModule
 * Created by WJC on 2017/11/12 10:48
 * Describe : TODO
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    Activity provideActivity(){
        return mActivity;
    }

    @Provides
    @ActivityContext
    Context providesContext(){
        return mActivity;
    }
}
