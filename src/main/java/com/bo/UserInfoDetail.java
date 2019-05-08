package com.bo;

/**
 * Created by John on 2019/5/8.
 */
public class UserInfoDetail {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userPhone;

    private Byte userRoot;
    private String uAddress;

    private String uDis;

    private String uBg;

    private String uTx;

    private String uSex;

    private String uNickname;

    private String uCreatetime;

    private Integer fansNum;

    private Integer followNum;

    private String qryStartDate;

    private String qryEndDate;

    private Integer page;

    private Integer limit;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getQryStartDate() {
        return qryStartDate;
    }

    public void setQryStartDate(String qryStartDate) {
        this.qryStartDate = qryStartDate;
    }

    public String getQryEndDate() {
        return qryEndDate;
    }

    public void setQryEndDate(String qryEndDate) {
        this.qryEndDate = qryEndDate;
    }



    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

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

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuDis() {
        return uDis;
    }

    public void setuDis(String uDis) {
        this.uDis = uDis;
    }

    public String getuBg() {
        return uBg;
    }

    public void setuBg(String uBg) {
        this.uBg = uBg;
    }

    public String getuTx() {
        return uTx;
    }

    public void setuTx(String uTx) {
        this.uTx = uTx;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuCreatetime() {
        return uCreatetime;
    }

    public void setuCreatetime(String uCreatetime) {
        this.uCreatetime = uCreatetime;
    }
}
