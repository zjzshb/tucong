package com.bo;

public class PicLabelInfo {
    private Integer picLabelId;

    private String picLabelName;

    private String creatDate;

    private byte[] picLabelDis;

    public Integer getPicLabelId() {
        return picLabelId;
    }

    public void setPicLabelId(Integer picLabelId) {
        this.picLabelId = picLabelId;
    }

    public String getPicLabelName() {
        return picLabelName;
    }

    public void setPicLabelName(String picLabelName) {
        this.picLabelName = picLabelName;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }

    public byte[] getPicLabelDis() {
        return picLabelDis;
    }

    public void setPicLabelDis(byte[] picLabelDis) {
        this.picLabelDis = picLabelDis;
    }
}