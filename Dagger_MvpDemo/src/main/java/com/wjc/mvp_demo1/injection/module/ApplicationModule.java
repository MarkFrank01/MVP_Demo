package com.wjc.mvp_demo1.injection.module;

import android.app.Application;
import android.content.Context;

import com.wjc.mvp_demo1.injection.annotation.ApplicationContent;

import dagger.Module;
import dagger.Provides;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.injection.module
 * File_NAME : ApplicationModule
 * Created by WJC on 2017/11/12 10:52
 * Describe : TODO
 */

@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @ApplicationContent
    Context provideContext(){
        return mApplication;
    }
}
