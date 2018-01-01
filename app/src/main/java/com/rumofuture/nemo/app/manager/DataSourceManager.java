package com.rumofuture.nemo.app.manager;

import android.content.Context;

import com.rumofuture.nemo.model.source.BookRepository;
import com.rumofuture.nemo.model.source.PageRepository;
import com.rumofuture.nemo.model.source.UserRepository;
import com.rumofuture.nemo.model.source.local.BookLocalDataSource;
import com.rumofuture.nemo.model.source.local.PageLocalDataSource;
import com.rumofuture.nemo.model.source.local.UserLocalDataSource;
import com.rumofuture.nemo.model.source.remote.BookRemoteDataSource;
import com.rumofuture.nemo.model.source.remote.PageRemoteDataSource;
import com.rumofuture.nemo.model.source.remote.UserRemoteDataSource;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class DataSourceManager {

    public static UserRepository provideUserRepository(Context context) {
        return UserRepository.getInstance(
                UserLocalDataSource.getInstance(context),
                UserRemoteDataSource.getInstance()
        );
    }

    public static BookRepository provideBookRepository(Context context) {
        return BookRepository.getInstance(
                BookLocalDataSource.getInstance(context),
                BookRemoteDataSource.getInstance()
        );
    }

    public static PageRepository providePageRepository(Context context) {
        return PageRepository.getInstance(
                PageLocalDataSource.getInstance(context),
                PageRemoteDataSource.getInstance()
        );
    }
}
