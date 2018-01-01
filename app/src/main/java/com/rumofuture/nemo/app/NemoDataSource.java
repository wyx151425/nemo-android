package com.rumofuture.nemo.app;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public interface NemoDataSource<T> {

    interface Callback<E> {
        void onSuccess(E data);
        void onError(String message);
    }
}
