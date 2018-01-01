package com.rumofuture.nemo.model.source.remote;

import android.util.Log;
import android.widget.Toast;

import com.rumofuture.nemo.app.NemoDataSource;
import com.rumofuture.nemo.app.manager.RetrofitManager;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.model.entity.User;
import com.rumofuture.nemo.model.service.UserService;
import com.rumofuture.nemo.model.source.UserDataSource;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class UserRemoteDataSource implements UserDataSource {

    private static final UserRemoteDataSource sInstance = new UserRemoteDataSource();
    private UserService userService;

    public static UserRemoteDataSource getInstance() {
        return sInstance;
    }

    private UserRemoteDataSource() {
         userService = RetrofitManager.getInstance().getUserService();
    }

    @Override
    public void login(User user, Callback<User> callback) {
        userService.login(user)
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<User>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<User> response) {
                        Log.i("UserDataSource", response.getMessage());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void register(User user, Callback<User> callback) {
        userService.register(user)
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<User>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response<User> response) {
                        Log.i("UserDataSource", response.getMessage());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
