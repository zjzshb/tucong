package com.bo;

public class PicCommentRel {
    private Integer commentId;

    private Integer picGroupId;

    private Integer userId;

    private String commMain;

    private String commDate;

    private String commState;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(Integer picGroupId) {
        this.picGroupId = picGroupId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommMain() {
        return commMain;
    }

    public void setCommMain(String commMain) {
        this.commMain = commMain;
    }

    public String getCommDate() {
        return commDate;
    }

    public void setCommDate(String commDate) {
        this.commDate = commDate;
    }

    public String getCommState() {
        return commState;
    }

    public void setCommState(String commState) {
        this.commState = commState;
    }
}