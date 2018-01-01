package com.rumofuture.nemo.model.source;

import android.support.annotation.NonNull;

import com.rumofuture.nemo.model.entity.User;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class UserRepository implements UserDataSource {

    private static UserRepository sInstance;
    private final UserDataSource mUserLocalDataSource;
    private final UserDataSource mUserRemoteDataSource;

    public static UserRepository getInstance(
            @NonNull UserDataSource userLocalDataSource,
            @NonNull UserDataSource userRemoteDataSource
    ) {
        if (null == sInstance) {
            sInstance = new UserRepository(userLocalDataSource, userRemoteDataSource);
        }
        return sInstance;
    }

    private UserRepository(
            @NonNull UserDataSource userLocalDataSource,
            @NonNull UserDataSource userRemoteDataSource
    ) {
        mUserLocalDataSource = userLocalDataSource;
        mUserRemoteDataSource = userRemoteDataSource;
    }

    @Override
    public void login(User user, Callback<User> callback) {
        mUserRemoteDataSource.login(user, callback);
    }

    @Override
    public void register(User user, Callback<User> callback) {
        mUserRemoteDataSource.register(user, callback);
    }
}
