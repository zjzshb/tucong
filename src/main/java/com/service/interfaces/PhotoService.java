package com.service.interfaces;

import com.bo.PicInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by John on 2019/5/5.
 */
public interface PhotoService {

    public int saveTempPic (PicInfo picInfo) throws Exception;

    public void changePicState(String[] ids,int userId,String picDescribe,String picLabel,String picTitle) throws Exception;

}
