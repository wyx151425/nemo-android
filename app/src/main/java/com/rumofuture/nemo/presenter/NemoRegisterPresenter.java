package com.rumofuture.nemo.presenter;

import android.support.annotation.NonNull;

import com.rumofuture.nemo.app.NemoDataSource;
import com.rumofuture.nemo.app.contract.NemoRegisterContract;
import com.rumofuture.nemo.model.entity.User;
import com.rumofuture.nemo.model.source.UserDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoRegisterPresenter implements NemoRegisterContract.Presenter {

    private NemoRegisterContract.View mView;
    private UserDataSource mUserRepository;

    public NemoRegisterPresenter(
            @NonNull NemoRegisterContract.View view,
            @NonNull UserDataSource userRepository
    ) {
        mView = view;
        mUserRepository = userRepository;
    }

    @Override
    public void start() {

    }

    @Override
    public void requestSMSCode(String mobilePhoneNumber) {

    }

    @Override
    public void verifySMSCode(String mobilePhoneNumber, String smsCode) {

    }

    @Override
    public void register(User user) {
        mUserRepository.register(user, new NemoDataSource.Callback<User>() {
            @Override
            public void onSuccess(User data) {
                mView.showRegisterSuccess();
            }

            @Override
            public void onError(String message) {
                mView.showRegisterFailed(message);
            }
        });
    }
}
