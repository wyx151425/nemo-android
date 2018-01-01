package com.rumofuture.nemo.model.source.local;

import android.content.Context;

import com.rumofuture.nemo.model.source.PageDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class PageLocalDataSource implements PageDataSource {

    private static PageLocalDataSource sInstance;
    private Context mContext;

    public static PageLocalDataSource getInstance(Context context) {
        if (sInstance == null)
            sInstance = new PageLocalDataSource(context);
        return sInstance;
    }

    private PageLocalDataSource(Context context) {
        mContext = context;
    }
}
