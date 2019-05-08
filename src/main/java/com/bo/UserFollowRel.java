package com.bo;

public class UserFollowRel {
    private Integer userId;

    private Integer userFollowId;

    private String followDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserFollowId() {
        return userFollowId;
    }

    public void setUserFollowId(Integer userFollowId) {
        this.userFollowId = userFollowId;
    }

    public String getFollowDate() {
        return followDate;
    }

    public void setFollowDate(String followDate) {
        this.followDate = followDate;
    }
}