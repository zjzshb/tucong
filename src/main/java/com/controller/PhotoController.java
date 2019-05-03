package com.controller;

import com.bo.PicInfo;
import com.utils.FastUtils;
import com.vo.BaseResponse;
import org.csource.fastdfs.DFSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
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
        // 用uuid作为文件名，防止生成的临时文件重复

        // MultipartFile to File

        try {
            File file = File.createTempFile(System.currentTimeMillis() + "", prefix);
            multfile.transferTo(file);
            String[] re= FastUtils.upLoadFile(file,file.getName(),file.length());
            StringBuffer sb = new StringBuffer();
            if(re.length == 0){
                response.setSuccess(false);
                response.setResultCode(BUSI_FAILURE_CODE);
                response.setResultMessage("上传失败");
                return response;
            }
            sb.append("119.23.191.210/").append(re[0]).append("/").append(re[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }



        return null;
    }

    private void deleteFile(File... files) {
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
