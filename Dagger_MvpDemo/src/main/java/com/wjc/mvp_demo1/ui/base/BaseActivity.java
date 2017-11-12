package com.wjc.mvp_demo1.ui.base;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;

import com.wjc.mvp_demo1.MyApplication;
import com.wjc.mvp_demo1.injection.component.ActivityComponent;
import com.wjc.mvp_demo1.injection.component.DaggerActivityComponent;
import com.wjc.mvp_demo1.injection.module.ActivityModule;
import com.wjc.mvp_demo1.utils.DialogUtils;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.ui.base
 * File_NAME : BaseActivity
 * Created by WJC on 2017/11/12 13:18
 * Describe : TODO
 */

public abstract class BaseActivity extends AppCompatActivity implements MvpView {

    private ActivityComponent mActivityComponent;
    private ProgressDialog progressDialog;

    public ActivityComponent activityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(MyApplication.get(this).getComponent())
                    .build();
        }
        return mActivityComponent;
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void requsetPermissionSafely(String[] permissions, int requestCode) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, requestCode);
        }
    }

    public boolean hasPermission(String permission) {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M ||
                checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void showLoading() {
        hideLoading();
        progressDialog = DialogUtils.showLoadingDialog(this);
    }

    @Override
    public void hideLoading() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.cancel();
        }
    }
}
