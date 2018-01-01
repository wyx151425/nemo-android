package com.rumofuture.nemo.model.entity;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoUser extends NemoEntity {

    private String name;  // 姓名
    private String email;  // 电子邮箱
    private String mobilePhoneNumber;  // 手机号
    private String password;  // 密码
    private Integer status;  // 状态：0-禁用用户/1-普通用户/2-普通可发布漫画用户
    private String token;

    public NemoUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
