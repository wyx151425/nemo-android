package com.rumofuture.nemo.model.entity;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class User extends NemoEntity {

    private String name;  // 姓名
    private String email;  // 电子邮箱
    private String mobilePhoneNumber;  // 手机号
    private String password;  // 密码
    private Integer status;  // 状态：0-禁用用户/1-普通用户/2-普通可发布漫画用户

    private String token;

    private String motto;  // 座右铭
    private String profile;  // 简介
    private String profession;  // 职业
    private String location;  // 所在地

    private String gender;  // 性别
    private String birthday;  // 生日

    private Integer age;  // 年龄
    private Integer followTotal;  // 关注作家数
    private Integer followerTotal;  // 粉丝数
    private Integer favoriteTotal; // 收藏漫画册数
    private Integer bookTotal;  // 漫画册数量

    private String avatarUrl;  // 头像
    private String portraitUrl;  // 个人肖像

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

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFollowTotal() {
        return followTotal;
    }

    public void setFollowTotal(Integer followTotal) {
        this.followTotal = followTotal;
    }

    public Integer getFollowerTotal() {
        return followerTotal;
    }

    public void setFollowerTotal(Integer followerTotal) {
        this.followerTotal = followerTotal;
    }

    public Integer getFavoriteTotal() {
        return favoriteTotal;
    }

    public void setFavoriteTotal(Integer favoriteTotal) {
        this.favoriteTotal = favoriteTotal;
    }

    public Integer getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(Integer bookTotal) {
        this.bookTotal = bookTotal;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }
}
