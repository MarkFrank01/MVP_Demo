package com.wjc.simplemvp.login;

import com.wjc.simplemvp.BasePresenter;
import com.wjc.simplemvp.BaseView;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.simplemvp.login
 * File_NAME : LoginContract
 * Created by WJC on 2017/11/12 16:36
 * Describe : TODO
 */

public class LoginContract {

    interface View extends BaseView<Presenter>{

        void setUsernameError();

        void setPasswordError();

        void navigateToHome();

    }

    interface Presenter extends BasePresenter{

        void validateCredentials(String username, String password);

        void login(String username, String password, OnLoginFinishedListener listener);

        interface OnLoginFinishedListener {
            void onUsernameError();

            void onPasswordError();

            void onSuccess();
        }

    }

}
