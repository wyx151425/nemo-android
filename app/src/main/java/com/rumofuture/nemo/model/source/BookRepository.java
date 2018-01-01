package com.rumofuture.nemo.model.source;

import android.support.annotation.NonNull;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class BookRepository implements BookDataSource {

    private static BookRepository sInstance;

    private final BookDataSource mBookLocalDataSource;
    private final BookDataSource mBookRemoteDataSource;

    public static BookRepository getInstance(
            @NonNull BookDataSource nemoLocalDataSource,
            @NonNull BookDataSource nemoRemoteDataSource
    ) {
        if (null == sInstance) {
            sInstance = new BookRepository(nemoLocalDataSource, nemoRemoteDataSource);
        }
        return sInstance;
    }

    private BookRepository(
            @NonNull BookDataSource bookLocalDataSource,
            @NonNull BookDataSource bookRemoteDataSource
    ) {
        mBookLocalDataSource = bookLocalDataSource;
        mBookRemoteDataSource = bookRemoteDataSource;
    }
}
