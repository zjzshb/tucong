package com.controller;

import com.bo.PicInfo;
import com.service.interfaces.PhotoService;
import com.utils.DateUtils;
import com.utils.FastUtils;
import com.vo.BaseResponse;
import org.csource.common.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

import static com.vo.BaseCode.BUSI_FAILURE_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_CODE;
import static com.vo.BaseCode.BUSI_SUCCESS_MESSAGE;

/**
 * Created by John on 2019/4/21.
 */
@Controller
public class PhotoController {
    private static Logger log= LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private PhotoService photoService;

    @ResponseBody
    @RequestMapping(value = "/doUpLoadPic",method = RequestMethod.POST)
    public BaseResponse<PicInfo> upLoadPic (HttpServletRequest request){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        MultipartHttpServletRequest multipartRequest =  (MultipartHttpServletRequest) request;
        MultipartFile multfile = multipartRequest.getFile("pic");
        // 获取文件名
        String fileName = multfile.getOriginalFilename();
        // 获取文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));
        String fileSize =String.valueOf(multfile.getSize());

        StringBuffer sb = new StringBuffer();

        try {
            File file = File.createTempFile(System.currentTimeMillis() + "", prefix);
            multfile.transferTo(file);
            String[] re= FastUtils.upLoadFile(file);

            if(re.length == 0){
                response.setSuccess(false);
                response.setResultCode(BUSI_FAILURE_CODE);
                response.setResultMessage("上传失败");
                return response;
            }
            sb.append("http://119.23.191.210:8888/").append(re[0]).append("/").append(re[1]);

        } catch (Exception e) {
            e.printStackTrace();
        }
        String address = sb.toString();
        if(address!=""&&address!=null){
            PicInfo picInfo = new PicInfo();
            picInfo.setPicAddress(address);
            picInfo.setPicState("0");
            picInfo.setPicUpDate(DateUtils.getNowDate());
            picInfo.setPicSize(fileSize);
            try {
                int picId = photoService.saveTempPic(picInfo);
                picInfo.setPicId(picId);
                response.setResult(picInfo);
            }catch (Exception e){
                response.setSuccess(false);
                response.setResultCode(BUSI_FAILURE_CODE);
                response.setResultMessage("上传失败");
                log.error(e.toString());
                return response;
            }
        }
        return response;
    }

    @ResponseBody
    @RequestMapping(value = "/doPublishPic",method = RequestMethod.POST)
    public BaseResponse PublishPic(@RequestParam(value = "sucPicArr[]") String[] sucPicArr
            ,@RequestParam(value = "picDescribe") String picDescribe,HttpSession session){
        BaseResponse response = new BaseResponse(true,BUSI_SUCCESS_CODE,BUSI_SUCCESS_MESSAGE);
        int userId = (int)session.getAttribute("userId");
        try {
            photoService.changePicState(sucPicArr,userId,picDescribe);
        }catch (Exception e){
            System.out.println(e);
            response.setSuccess(false);
            response.setResultCode(BUSI_FAILURE_CODE);
            response.setResultMessage("发布失败");
            return response;
        }
        return response;
    }
}
