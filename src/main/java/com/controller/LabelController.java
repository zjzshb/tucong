package com.controller;

import com.bo.PicLabelInfo;
import com.service.interfaces.LabelService;
import com.vo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.vo.BaseCode.BUSI_FAILURE_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_MESSAGE;

/**
 * Created by John on 2019/5/6.
 */
@Controller
public class LabelController {
    @Autowired
    LabelService labelService;
    @ResponseBody
    @RequestMapping(value = "getLabelInfo",method = RequestMethod.POST)
    private BaseResponse<PicLabelInfo>getLabelInfo(){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);

        try {
            List<PicLabelInfo> rsp = labelService.getLabelInfo();
            response.setResult(rsp);
        }catch (Exception e){
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("初始化标签失败");
            return response;
        }
        return response;
    }
}
