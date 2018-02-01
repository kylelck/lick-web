package com.lick.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @description： 切面实现拦截器,controller拦截
 * @author: lick
 * @date: 2018年01月17日 11:11
 * @copyright: 版权归所有
 */
@Component
@Aspect
public class ControllerAopInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAopInterceptor.class);

    @Pointcut("execution(* com.lick.controller..*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerMethodPointcut(){}

    @Around("controllerMethodPointcut()")
    public Object interceptor(ProceedingJoinPoint pjp){
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        String methodName = method.getName();
        logger.info("请求开始，方法：{}", methodName);
        Object result = null;
        try{
            result = pjp.proceed();
        }catch (Throwable e){

        }
        long costMs = System.currentTimeMillis() - beginTime;
        logger.info("{}请求结束，耗时：{}ms", methodName, costMs);
        return result;
    }
}
