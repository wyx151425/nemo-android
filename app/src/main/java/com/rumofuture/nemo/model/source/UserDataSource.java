package com.rumofuture.nemo.model.source;

import com.rumofuture.nemo.app.NemoDataSource;
import com.rumofuture.nemo.model.entity.User;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public interface UserDataSource extends NemoDataSource {

    // 用户登录
    void login(User user, Callback<User> callback);
    // 用户注册
    void register(User user, Callback<User> callback);
}
