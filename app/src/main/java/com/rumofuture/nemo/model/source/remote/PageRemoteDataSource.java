package com.rumofuture.nemo.model.source.remote;

import com.rumofuture.nemo.model.source.PageDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class PageRemoteDataSource implements PageDataSource {

    private static final int PAGE_LIMIT = 64;

    private static final PageRemoteDataSource sInstance = new PageRemoteDataSource();

    public static PageRemoteDataSource getInstance() {
        return sInstance;
    }

    private PageRemoteDataSource() {

    }
}
