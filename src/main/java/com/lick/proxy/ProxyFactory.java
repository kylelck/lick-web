package com.lick.proxy;

import com.lick.advice.TestAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description： 动态代理
 * @author: lick
 * @date: 2018年02月28日 17:30
 *
 */
public class ProxyFactory implements InvocationHandler {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        TestAdvice.begin(target.getClass().getName() + "." + method.getName());
        Object obj = method.invoke(target,args);
        TestAdvice.end();
        return obj;
    }
}
