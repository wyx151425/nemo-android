package com.rumofuture.nemo.model.source.remote;

import com.rumofuture.nemo.model.source.BookDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class BookRemoteDataSource implements BookDataSource {

    private static final BookRemoteDataSource sInstance = new BookRemoteDataSource();

    public static BookRemoteDataSource getInstance() {
        return sInstance;
    }

    private BookRemoteDataSource() {

    }
}
