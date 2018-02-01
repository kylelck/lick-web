package com.lick.controller;

import com.lick.service.UserInfoService;
import com.lick.vo.UserInfoReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年01月16日 11:44
 * @copyright: 版权归hsyuntai 所有
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {
    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getUserInfo(@RequestBody UserInfoReq userInfoReq){
        logger.info("get user info consumer :{}",userInfoReq.getUserCode());
        return userInfoService.getUserInfo(userInfoReq);
    }
}
