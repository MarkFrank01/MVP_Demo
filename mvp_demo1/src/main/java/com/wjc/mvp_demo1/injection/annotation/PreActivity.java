package com.wjc.mvp_demo1.injection.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.injection.annotation
 * File_NAME : PreActivity
 * Created by WJC on 2017/11/12 10:44
 * Describe : TODO
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PreActivity {
}
