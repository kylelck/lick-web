package com.lick.service.impl;

import com.lick.proxy.ProxyFactory;
import com.lick.service.UserService;

import java.lang.reflect.Proxy;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年02月28日 17:40
 * @copyright: 版权归hsyuntai 所有
 */
public class UserServiceImpl implements UserService {
    @Override
    public void removeUsr(int userId) {
        System.out.println("delete user:"+userId);
    }
}
