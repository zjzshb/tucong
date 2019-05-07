package com.bo;

/**
 * Created by John on 2019/5/7.
 */
//(`picDescribe`, `picGroupId`, `picGroupState`, `picTitle`, `picUpDate`, `userId`, `picLabelName`, `picLabelId`, `uNickname`, `commentNum`, `likeNum`, `picAdress`)

public class QryPhotoBean {
    private String picDescribe;
    private Integer picGroupId;
    private String picGroupState;
    private String picTitle;
    private String picUpDate;
    private Integer userId;
    private String picLabelName;
    private Integer picLabelId ;
    private String uNickname;
    private  Integer commentNum;
    private Integer likeNum;
    private String  picAdress;
    private String qryStartDate;
    private String QryEndDate;
    private Integer start;
    private Integer end;

    public String getPicDescribe() {
        return picDescribe;
    }

    public void setPicDescribe(String picDescribe) {
        this.picDescribe = picDescribe;
    }

    public Integer getPicGroupId() {
        return picGroupId;
    }

    public void setPicGroupId(Integer picGroupId) {
        this.picGroupId = picGroupId;
    }

    public String getPicGroupState() {
        return picGroupState;
    }

    public void setPicGroupState(String picGroupState) {
        this.picGroupState = picGroupState;
    }

    public String getPicTitle() {
        return picTitle;
    }

    public void setPicTitle(String picTitle) {
        this.picTitle = picTitle;
    }

    public String getPicUpDate() {
        return picUpDate;
    }

    public void setPicUpDate(String picUpDate) {
        this.picUpDate = picUpDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPicLabelName() {
        return picLabelName;
    }

    public void setPicLabelName(String picLabelName) {
        this.picLabelName = picLabelName;
    }

    public Integer getPicLabelId() {
        return picLabelId;
    }

    public void setPicLabelId(Integer picLabelId) {
        this.picLabelId = picLabelId;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public String getPicAdress() {
        return picAdress;
    }

    public void setPicAdress(String picAdress) {
        this.picAdress = picAdress;
    }

    public String getQryStartDate() {
        return qryStartDate;
    }

    public void setQryStartDate(String qryStartDate) {
        this.qryStartDate = qryStartDate;
    }

    public String getQryEndDate() {
        return QryEndDate;
    }

    public void setQryEndDate(String qryEndDate) {
        QryEndDate = qryEndDate;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
