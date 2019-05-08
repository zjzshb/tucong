package com.service.interfaces;

import com.bo.UserFollowRel;

import java.util.List;

/**
 * Created by John on 2019/5/9.
 */
public interface FollowService {

    public UserFollowRel insertFollowRel(UserFollowRel userFollowRel)throws Exception;

    public List<Integer> qryFans(UserFollowRel userFollowRel)throws Exception;

    public List<Integer> qryFollows(UserFollowRel userFollowRel)throws Exception;
}
