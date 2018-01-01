package com.rumofuture.nemo.model.service;

import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.model.entity.User;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public interface UserService {

    @POST
    Observable<Response<User>> login(@Body User user);

    @POST
    Observable<Response<User>> register(@Body User user);
}
