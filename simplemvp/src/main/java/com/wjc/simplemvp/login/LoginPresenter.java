package com.wjc.simplemvp.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.simplemvp.login
 * File_NAME : LoginPresenter
 * Created by WJC on 2017/11/12 16:59
 * Describe : TODO
 */

public class LoginPresenter implements LoginContract.Presenter,LoginContract.Presenter.OnLoginFinishedListener {

    LoginContract.View mView;

    public LoginPresenter(LoginContract.View view){
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void onDestroy() {
        mView = null;
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (mView != null){
            mView.showProgress();
        }

        login(username,password,this);
    }

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }

    @Override public void onUsernameError() {
        if (mView != null) {
            mView.setUsernameError();
            mView.hideProgress();
        }
    }

    @Override public void onPasswordError() {
        if (mView != null) {
            mView.setPasswordError();
            mView.hideProgress();
        }
    }

    @Override public void onSuccess() {
        if (mView != null) {
            mView.navigateToHome();
        }
    }
}
