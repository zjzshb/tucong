package com.service.impl;

import com.bo.UserFollowRel;
import com.bo.UserFollowRelExample;
import com.dao.UserFollowRelMapper;
import com.service.interfaces.FollowService;
import com.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 2019/5/9.
 */
@Service("followService")
public class FollowServiceImpl implements FollowService {
    @Autowired
    private UserFollowRelMapper userFollowRelMapper;
    @Override
    public UserFollowRel insertFollowRel(UserFollowRel userFollowRel) throws Exception {
        userFollowRel.setFollowDate(DateUtils.getNowDate());
        userFollowRelMapper.insert(userFollowRel);
        return userFollowRel;
    }

    @Override
    public List<Integer> qryFans(UserFollowRel userFollowRel) throws Exception {
        List<Integer> fansList = new ArrayList<Integer>();
        UserFollowRelExample userFollowRelExample = new UserFollowRelExample();
        UserFollowRelExample.Criteria criteria = userFollowRelExample.createCriteria();
        criteria.andUserFollowIdEqualTo(userFollowRel.getUserFollowId());
        List<UserFollowRel> result = userFollowRelMapper.selectByExample(userFollowRelExample);
        if(result!=null){
            for (UserFollowRel bean:result){
                fansList.add(bean.getUserId());
            }

        }
        return fansList;
    }

    @Override
    public List<Integer> qryFollows(UserFollowRel userFollowRel) throws Exception {
        List<Integer> followList = new ArrayList<Integer>();
        UserFollowRelExample userFollowRelExample = new UserFollowRelExample();
        UserFollowRelExample.Criteria criteria = userFollowRelExample.createCriteria();
        criteria.andUserIdEqualTo(userFollowRel.getUserId());
        List<UserFollowRel> result = userFollowRelMapper.selectByExample(userFollowRelExample);
        if(result!=null){
            for (UserFollowRel bean:result){
                followList.add(bean.getUserId());
            }

        }
        return followList;
    }
}
