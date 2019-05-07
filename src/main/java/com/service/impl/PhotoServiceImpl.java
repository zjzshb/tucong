package com.service.impl;

import com.bo.*;
import com.dao.*;
import com.service.interfaces.PhotoService;
import com.utils.DateUtils;
import com.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by John on 2019/5/5.
 */
@Service("PhotoService")
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PicInfoMapper picInfoMapper;
    @Autowired
    private PicGroupInfoMapper picGroupInfoMapper;
    @Autowired
    private PicLabelInfoMapper picLabelInfoMapper;
    @Autowired
    private PicLabelRelMapper picLabelRelMapperl;
    @Autowired
    private PicCommentRelMapper picCommentRelMapper;
    @Override
    public int saveTempPic(PicInfo picInfo)throws Exception {

        picInfoMapper.insert(picInfo);
        //
        return picInfo.getPicId();

    }

    @Override
    public void changePicState(String[] ids,int userId,String picDescribe,String picLabel,String picTitle) throws Exception {
        //生成一个照片组
        PicGroupInfo picGroupInfo = new PicGroupInfo();
        picGroupInfo.setUserId(userId);
        picGroupInfo.setPicDescribe(picDescribe);
        picGroupInfo.setPicUpDate(DateUtils.getNowDate());
        picGroupInfo.setPicGroupState("1");
        picGroupInfo.setPicTitle(picTitle);
        picGroupInfoMapper.insert(picGroupInfo);

        int picGroupId = picGroupInfo.getPicGroupId();
        //保存图片与图片组的关系
        for (int i = 0;i<ids.length;i++){
            PicInfo picInfo= picInfoMapper.selectByPrimaryKey(Integer.valueOf(ids[i]));
            picInfo.setPicState("1");
            picInfo.setPicGroupId(picGroupId);
            picInfoMapper.updateByPrimaryKey(picInfo);
        }
        //保存图片组与标签的关系
        this.saveLabel(picGroupId,picLabel);


    }

    @Override
    public List<QryPhotoBean> qryPhotoByCondition(QryPhotoBean qryPhotoBean) throws Exception {
        qryPhotoBean.setPicGroupState("1");
       return   picInfoMapper.qryPhotoByCondition(qryPhotoBean);
    }

    @Override
    public QryPhotoDetailBean qryPhotoDetailByCondition(QryPhotoDetailBean qryPhotoDetailBean) throws Exception {
        QryPhotoDetailBean result = picInfoMapper.qryPhotoDetailByCondition(qryPhotoDetailBean);

        //获取照片组中各照片的地址
        PicInfoExample picInfoExample = new PicInfoExample();
        PicInfoExample.Criteria criteria = picInfoExample.createCriteria();
        criteria.andPicGroupIdEqualTo(qryPhotoDetailBean.getGroupId());
        List<PicInfo> picInfoList = picInfoMapper.selectByExample(picInfoExample);
        List<String> addressList = new ArrayList<String>();
        if(picInfoList!=null && picInfoList.size()!=0){
            for (PicInfo picInfo : picInfoList){
                addressList.add(picInfo.getPicAddress());
            }
        }
        result.setAdress(addressList);
        //获取照片组的评论
        QryCommentBean qryCommentBean = new QryCommentBean();
        qryCommentBean.setPicGroupId(qryPhotoDetailBean.getGroupId());
        List<QryCommentBean> commentBeanList = picCommentRelMapper.qryCommentByCondition(qryCommentBean);
        result.setComments(commentBeanList);


        return result;
    }


    private void saveLabel(int picGoupId,String Label){
        List<String> labelNameList = StringUtils.DuplicateRemoval(Label);
        Map<String,PicLabelInfo> labelInfoMap = new HashMap<String,PicLabelInfo>();
        for(String labelName : labelNameList){
            PicLabelInfoExample picLabelInfoExample = new PicLabelInfoExample();
            PicLabelInfoExample.Criteria criteria = picLabelInfoExample.createCriteria();
            criteria.andPicLabelNameEqualTo(labelName);
            List<PicLabelInfo>  picLabelInfos =picLabelInfoMapper.selectByExample(picLabelInfoExample);
            if (picLabelInfos!=null&&picLabelInfos.size()!=0){
                labelInfoMap.put(labelName,picLabelInfos.get(0));
            }
        }
        for (String labelName:labelNameList){
            if(labelInfoMap.containsKey(labelName)){
                PicLabelRel picLabelRel = new PicLabelRel();
                picLabelRel.setPicGroupId(picGoupId);
                picLabelRel.setPicLabelId(labelInfoMap.get(labelName).getPicLabelId());
                picLabelRelMapperl.insert(picLabelRel);
            }
        }
    }

}
