package com.wjc.simplemvp.login;

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
