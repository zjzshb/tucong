package com.bo;

import java.util.List;

/**
 * Created by John on 2019/5/8.
 */
public class QryPhotoDetailBean {
    private List<String> adress;
    private String picUpDate;
    private List<QryCommentBean> comments;
    private Integer userId;
    private String nikeName;
    private Integer groupId;
    private String picDescribe;
    private String picTitle;

    public String getPicDescribe() {
        return picDescribe;
    }

    public void setPicDescribe(String picDescribe) {
        this.picDescribe = picDescribe;
    }

    public String getPicTitle() {
        return picTitle;
    }

    public void setPicTitle(String picTitle) {
        this.picTitle = picTitle;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public List<String> getAdress() {
        return adress;
    }

    public void setAdress(List<String> adress) {
        this.adress = adress;
    }

    public String getPicUpDate() {
        return picUpDate;
    }

    public void setPicUpDate(String picUpDate) {
        this.picUpDate = picUpDate;
    }

    public List<QryCommentBean> getComments() {
        return comments;
    }

    public void setComments(List<QryCommentBean> comments) {
        this.comments = comments;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }
}
