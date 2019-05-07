package com.bo;

/**
 * Created by John on 2019/5/8.
 */
public class QryCommentBean {
    private Integer picGroupId;

    private Integer userId;

    private String commMain;

    private String commDate;

    private String nikeName;

    private String commState;

    private String qryStartDate;

    private String qryEndDate;

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

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getCommState() {
        return commState;
    }

    public void setCommState(String commState) {
        this.commState = commState;
    }
}
