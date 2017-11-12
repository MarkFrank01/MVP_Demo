package com.wjc.simplemvp.main;

import com.wjc.simplemvp.BasePresenter;
import com.wjc.simplemvp.BaseView;

import java.util.List;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.simplemvp.main
 * File_NAME : MainContract
 * Created by WJC on 2017/11/12 17:40
 * Describe : TODO
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

        void setItems(List<String> items);

        void showMessage(String message);

    }

    interface Presenter extends BasePresenter {

        void onResume();

        void onItemClicked(int position);

        void findItems(OnFinishedListener listener);

        interface OnFinishedListener{

            void onFinished(List<String> items);

        }
    }
}
