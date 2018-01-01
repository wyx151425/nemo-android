package com.rumofuture.nemo.model.source;

import android.support.annotation.NonNull;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class PageRepository implements PageDataSource {

    private static PageRepository sInstance;
    private final PageDataSource mPageLocalDataSource;
    private final PageDataSource mPageRemoteDataSource;

    public static PageRepository getInstance(
            @NonNull PageDataSource pageLocalDataSource,
            @NonNull PageDataSource pageRemoteDataSource
    ) {
        if (null == sInstance) {
            sInstance = new PageRepository(pageLocalDataSource, pageRemoteDataSource);
        }
        return sInstance;
    }

    private PageRepository(
            @NonNull PageDataSource pageLocalDataSource,
            @NonNull PageDataSource pageRemoteDataSource
    ) {
        mPageLocalDataSource = pageLocalDataSource;
        mPageRemoteDataSource = pageRemoteDataSource;
    }
}
