package com.wjc.mvp_demo1.injection.component;

import android.app.Application;
import android.content.Context;

import com.wjc.mvp_demo1.MyApplication;
import com.wjc.mvp_demo1.data.DataManager;
import com.wjc.mvp_demo1.injection.annotation.ApplicationContent;
import com.wjc.mvp_demo1.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.injection.component
 * File_NAME : ApplicationComponent
 * Created by WJC on 2017/11/12 11:32
 * Describe : TODO
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApplication myApplication);

    @ApplicationContent
    Context context();

    Application application();
    DataManager dataManager();
}
