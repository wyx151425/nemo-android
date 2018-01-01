package com.rumofuture.nemo.view.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.rumofuture.nemo.R;
import com.rumofuture.nemo.app.manager.DataSourceManager;
import com.rumofuture.nemo.presenter.NemoLoginPresenter;
import com.rumofuture.nemo.view.fragment.NemoLoginFragment;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoLoginActivity extends NemoFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NemoLoginFragment fragment =
                (NemoLoginFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = NemoLoginFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragment).commit();
        }

        NemoLoginPresenter presenter = new NemoLoginPresenter(fragment,
                DataSourceManager.provideUserRepository(NemoLoginActivity.this));

        fragment.setPresenter(presenter);
    }

}
