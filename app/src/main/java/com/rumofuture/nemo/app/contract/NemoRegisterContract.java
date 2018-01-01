package com.rumofuture.nemo.app.contract;

import com.rumofuture.nemo.app.NemoPresenter;
import com.rumofuture.nemo.app.NemoView;
import com.rumofuture.nemo.model.entity.User;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public interface NemoRegisterContract {

    interface View extends NemoView<NemoRegisterContract.Presenter> {
        void showRegisterSuccess();
        void showRegisterFailed(String message);

        void showRequestSMSCodeSuccess(String smsCode);
        void showRequestSMSCodeFailed(String message);
    }

    interface Presenter extends NemoPresenter {
        void requestSMSCode(String mobilePhoneNumber);
        void verifySMSCode(String mobilePhoneNumber, String smsCode);
        void register(User user);
    }
}
