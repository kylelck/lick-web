package com.lick.proxy;

import com.lick.advice.TestAdvice;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description： cglib代理
 * @author: lick@hsyuntai.com
 * @date: 2018年02月28日 18:09
 * @copyright: 版权归hsyuntai 所有
 */
public class CglibProxy implements MethodInterceptor{

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        TestAdvice.begin(o.getClass().getName() + "." + method.getName());
        Object obj = methodProxy.invokeSuper(o,objects);
        TestAdvice.end();
        return obj;
    }
}
