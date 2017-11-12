package com.wjc.mvp_demo1.injection.component;

import com.wjc.mvp_demo1.ui.main.MainActivity;
import com.wjc.mvp_demo1.injection.annotation.PreActivity;
import com.wjc.mvp_demo1.injection.module.ActivityModule;

import dagger.Component;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.injection.component
 * File_NAME : ActivityComponent
 * Created by WJC on 2017/11/12 11:28
 * Describe : TODO
 */

@PreActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
