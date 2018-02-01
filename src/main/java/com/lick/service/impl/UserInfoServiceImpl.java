package com.lick.service.impl;

import com.lick.integration.UserInfoClient;
import com.lick.service.UserInfoService;
import com.lick.vo.UserInfoReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年01月16日 13:12
 * @copyright: 版权归hsyuntai 所有
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    UserInfoClient userInfoClient;

    @Override
    public String getUserInfo(UserInfoReq userInfoReq){
        return userInfoClient.getUserInfo(userInfoReq);
    }
}
