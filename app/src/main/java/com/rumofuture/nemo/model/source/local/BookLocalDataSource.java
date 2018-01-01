package com.rumofuture.nemo.model.source.local;

import android.content.Context;

import com.rumofuture.nemo.model.source.BookDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class BookLocalDataSource implements BookDataSource {

    private static BookLocalDataSource sInstance;

    private Context mContext;

    public static BookLocalDataSource getInstance(Context context) {
        if (sInstance == null)
            sInstance = new BookLocalDataSource(context);
        return sInstance;
    }

    private BookLocalDataSource(Context context) {
        mContext = context;
    }
}
