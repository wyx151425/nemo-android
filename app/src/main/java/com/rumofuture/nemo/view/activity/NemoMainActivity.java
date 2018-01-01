package com.rumofuture.nemo.view.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.rumofuture.nemo.R;
import com.rumofuture.nemo.app.NemoActivity;

import java.lang.reflect.Field;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoMainActivity extends NemoActivity {

    private static final String TAG = "NemoMainActivity";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    return true;
                case R.id.navigation_album:
                    return true;
                case R.id.navigation_discover:
                    return true;
                case R.id.navigation_me:
                return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nemo_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation_view);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        NemoMainActivity.BottomNavigationViewHelper.disableShiftMode(navigation);
    }

    // 取消底部选项卡偶数图标缩放
    private static class BottomNavigationViewHelper {

        @SuppressLint("RestrictedApi")
        static void disableShiftMode(BottomNavigationView view) {
            BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
            try {
                Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
                shiftingMode.setAccessible(true);
                shiftingMode.setBoolean(menuView, false);
                shiftingMode.setAccessible(false);
                for (int index = 0; index < menuView.getChildCount(); index++) {
                    BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(index);
                    item.setShiftingMode(false);
                    item.setChecked(item.getItemData().isChecked());
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                Log.e(TAG, "disableShiftMode: ", e);
            }
        }
    }
}
