package com.lick.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月16日 15:13
 * @copyright: 版权归所有
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    @ResponseBody
    public String index(HttpServletRequest request){
        logger.info("session id is {}"+request.getSession().getId());
        return request.getSession().getId();
    }
}
