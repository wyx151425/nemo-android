package com.rumofuture.nemo.model.source.local;

import android.content.Context;

import com.rumofuture.nemo.app.NemoDataSource;
import com.rumofuture.nemo.model.entity.User;
import com.rumofuture.nemo.model.source.UserDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class UserLocalDataSource implements UserDataSource {

    private Context mContext;
    private static UserLocalDataSource sInstance;

    public static UserLocalDataSource getInstance(Context context) {
        if (sInstance == null)
            sInstance = new UserLocalDataSource(context);
        return sInstance;
    }

    private UserLocalDataSource(Context context) {
        mContext = context;
    }

    @Override
    public void login(User user, Callback<User> callback) {

    }

    @Override
    public void register(User user, Callback<User> callback) {

    }
}
