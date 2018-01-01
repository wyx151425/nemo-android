package com.rumofuture.nemo.app.manager;

import com.google.gson.GsonBuilder;
import com.rumofuture.nemo.model.service.UserService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class RetrofitManager {
    private static RetrofitManager instance = new RetrofitManager();

    private Retrofit mRetrofit = null;

    public static RetrofitManager getInstance() {
        return instance;
    }

    private RetrofitManager() {
        OkHttpClient client = new OkHttpClient();
        GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());
        mRetrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/nemo/")
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public UserService getUserService() {
        return mRetrofit.create(UserService.class);
    }
}
