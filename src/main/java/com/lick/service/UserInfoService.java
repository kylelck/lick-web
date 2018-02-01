package com.lick.service;

import com.lick.integration.UserInfoClient;
import com.lick.vo.UserInfoReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月16日 11:42
 * @copyright: 版权归所有
 */
public interface UserInfoService {
    public String getUserInfo(UserInfoReq userInfoReq);
}
