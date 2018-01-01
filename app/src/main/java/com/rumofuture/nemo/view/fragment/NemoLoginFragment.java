package com.rumofuture.nemo.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rumofuture.nemo.R;
import com.rumofuture.nemo.app.contract.NemoLoginContract;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoLoginFragment extends Fragment implements NemoLoginContract.View {


    public NemoLoginFragment() {

    }

    public static NemoLoginFragment newInstance() {
        return new NemoLoginFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nemo_login, container, false);
    }

    @Override
    public void setPresenter(NemoLoginContract.Presenter presenter) {

    }

    @Override
    public void showLoginSuccess() {

    }

    @Override
    public void showLoginFailed(String message) {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
