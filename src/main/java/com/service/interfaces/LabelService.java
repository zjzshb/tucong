package com.service.interfaces;

import com.bo.PicLabelInfo;

import java.util.List;

/**
 * Created by John on 2019/5/6.
 */
public interface LabelService {

    public List<PicLabelInfo> getLabelInfo()throws Exception;
}
