package com.service.impl;

import com.bo.PicLabelInfo;
import com.bo.PicLabelInfoExample;
import com.dao.PicLabelInfoMapper;
import com.service.interfaces.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by John on 2019/5/6.
 */
@Service("labelService")
public class LabelServiceImpl implements LabelService {
    @Autowired
    private PicLabelInfoMapper picLabelInfoMapper;
    @Override
    public List<PicLabelInfo> getLabelInfo() throws Exception {
        PicLabelInfoExample picLabelInfoExample = new PicLabelInfoExample();
        List<PicLabelInfo> resp = picLabelInfoMapper.selectByExample(picLabelInfoExample);
        return resp;
    }
}
