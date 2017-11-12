package com.wjc.mvp_demo1.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import com.wjc.mvp_demo1.R;

/**
 * Project_NAME : MVPandView_Demo
 * Package_NAME : com.wjc.mvp_demo1.utils
 * File_NAME : DialogUtils
 * Created by WJC on 2017/11/11 21:37
 * Describe : TODO
 */

public class DialogUtils {

    public DialogUtils(){

        // This utility class is not publicly instantiable

    }

    public static ProgressDialog showLoadingDialog(Context context){
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.show();
        if(progressDialog.getWindow()!=null){
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
