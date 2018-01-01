package com.rumofuture.nemo.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rumofuture.nemo.R;
import com.rumofuture.nemo.app.contract.NemoRegisterContract;

public class NemoRegisterFragment extends Fragment implements NemoRegisterContract.View {

    private NemoRegisterContract.Presenter mPresenter;

    public NemoRegisterFragment() {
        
    }

    public static NemoRegisterFragment newInstance() {
        return new NemoRegisterFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nemo_register, container, false);
    }

    @Override
    public void setPresenter(NemoRegisterContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showRegisterSuccess() {

    }

    @Override
    public void showRegisterFailed(String message) {

    }

    @Override
    public void showRequestSMSCodeSuccess(String smsCode) {

    }

    @Override
    public void showRequestSMSCodeFailed(String message) {

    }
}
