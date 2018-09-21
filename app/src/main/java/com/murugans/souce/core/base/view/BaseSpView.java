package com.murugans.souce.core.base.view;

import android.support.annotation.StringRes;

/**
 * Created by murugan.s on 7/13/2018.
 */

public interface BaseSpView {

    void showLoading();

    void showLoading(String message);

    void showLoading(int strinRes);

    void hideLoading();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();

    void setLayoutDirection(int direction);

    void handleLayoutDirection(String language);

    void setBlueTheme();

    void setRedTheme();

    void setOrangeTheme();

    void setGreenTheme();

    void setPinkTheme();

    void setNavyBlueTheme();

    void setFontSize(String fontSize);

    void showAlert(String title,String msg);

    //void showAlert(String title, String msg, CommonDialog.PositiveClickListener positiveClickListener);

    void createNFCManager();

    void resumeNFCManager();

    void pauseNFCManager();
}
