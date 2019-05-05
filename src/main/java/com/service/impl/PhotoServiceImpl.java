package com.service.impl;

import com.bo.PicGroupInfo;
import com.bo.PicInfo;
import com.dao.PicGroupInfoMapper;
import com.dao.PicInfoMapper;
import com.service.interfaces.PhotoService;
import com.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by John on 2019/5/5.
 */
@Service("PhotoService")
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PicInfoMapper picInfoMapper;
    @Autowired
    private PicGroupInfoMapper picGroupInfoMapper;
    @Override
    public int saveTempPic(PicInfo picInfo)throws Exception {

        picInfoMapper.insert(picInfo);
        //
        return picInfo.getPicId();

    }

    @Override
    public void changePicState(String[] ids,int userId,String picDescribe) throws Exception {
        //生成一个照片组
        PicGroupInfo picGroupInfo = new PicGroupInfo();
        picGroupInfo.setUserId(userId);
        picGroupInfo.setPicDescribe(picDescribe);
        picGroupInfo.setPicUpDate(DateUtils.getNowDate());
        picGroupInfo.setPicGroupState("1");
        picGroupInfoMapper.insert(picGroupInfo);

        int picGroupId = picGroupInfo.getPicGroupId();

        for (int i = 0;i<ids.length;i++){
            PicInfo picInfo= picInfoMapper.selectByPrimaryKey(Integer.valueOf(ids[i]));
            picInfo.setPicState("1");
            picInfo.setPicGroupId(picGroupId);
            picInfoMapper.updateByPrimaryKey(picInfo);
        }

    }
}
