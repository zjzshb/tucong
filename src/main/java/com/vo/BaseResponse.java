package com.vo;

/**
 * Created by John on 2019/4/13.
 */
public class BaseResponse<T> {
    /**
     * 是否业务成功
     */
    private boolean success;

    /**
     * 是否成功代码："000000":成功，其他失败
     */
    private String resultCode;

    /**
     * 是否成功代码对应的信息
     */
    private String resultMessage;

    /**
     * 业务数据
     */
    private T result=null;

    /**
     * 默认构造函数
     */
    public BaseResponse() {
        super();
    }

    /**
     * 构造函数
     * @param success 是否成功
     * @param resultCode 是否成功代码
     * @param resultMessage 是否成功信息
     */
    public BaseResponse(boolean success, String resultCode, String resultMessage) {
        super();
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }


    /**
     * 构造函数
     * @param success 是否成功
     * @param resultCode 是否成功代码
     * @param resultMessage 是否成功信息

     * @param result 业务执行结果
     */
    public BaseResponse( boolean success, String resultCode, String resultMessage,T result) {
        super();
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.result = result;
    }



    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }


}
