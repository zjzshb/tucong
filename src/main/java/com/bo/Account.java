package com.bo;

public class Account {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userPhone;

    private Byte userRoot;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Byte getUserRoot() {
        return userRoot;
    }

    public void setUserRoot(Byte userRoot) {
        this.userRoot = userRoot;
    }
}