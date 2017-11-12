package com.wjc.mvp_demo1;

import android.app.Application;
import android.content.Context;

import com.androidnetworking.AndroidNetworking;
import com.wjc.mvp_demo1.injection.component.ApplicationComponent;
import com.wjc.mvp_demo1.injection.component.DaggerApplicationComponent;
import com.wjc.mvp_demo1.injection.module.ApplicationModule;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1
 * File_NAME : MyApplication
 * Created by WJC on 2017/11/11 21:35
 * Describe : TODO
 */

public class MyApplication extends Application{

    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);

    }

    public static MyApplication get(Context context){
        return (MyApplication)context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
