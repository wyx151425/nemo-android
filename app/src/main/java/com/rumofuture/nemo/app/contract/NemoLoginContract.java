package com.rumofuture.nemo.app.contract;

import com.rumofuture.nemo.app.NemoPresenter;
import com.rumofuture.nemo.app.NemoView;
import com.rumofuture.nemo.model.entity.User;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public interface NemoLoginContract {

    interface View extends NemoView<NemoLoginContract.Presenter> {
        void showLoginSuccess();
        void showLoginFailed(String message);

        boolean isActive();
    }

    interface Presenter extends NemoPresenter {
        void login(User user);
    }
}
