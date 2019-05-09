package com.vo;

/**
 * Created by John on 2019/5/9.
 */
public class LayuiResponse<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LayuiResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
