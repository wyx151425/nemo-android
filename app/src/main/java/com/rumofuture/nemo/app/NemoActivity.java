package com.rumofuture.nemo.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rumofuture.nemo.app.manager.ActivityManager;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.removeActivity(this);
    }
}
