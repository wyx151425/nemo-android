package com.rumofuture.nemo.presenter;

import android.support.annotation.NonNull;

import com.rumofuture.nemo.app.NemoDataSource;
import com.rumofuture.nemo.app.contract.NemoLoginContract;
import com.rumofuture.nemo.model.entity.User;
import com.rumofuture.nemo.model.source.UserDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoLoginPresenter implements NemoLoginContract.Presenter {

    private NemoLoginContract.View mView;
    private UserDataSource mUserRepository;

    public NemoLoginPresenter(
            @NonNull NemoLoginContract.View view,
            @NonNull UserDataSource userRepository
    ) {
        mView = view;
        mUserRepository = userRepository;
    }

    @Override
    public void start() {

    }

    @Override
    public void login(User user) {
        mUserRepository.login(user, new NemoDataSource.Callback<User>() {
            @Override
            public void onSuccess(User data) {
                mView.showLoginSuccess();
            }

            @Override
            public void onError(String message) {
                mView.showLoginFailed(message);
            }
        });
    }
}
