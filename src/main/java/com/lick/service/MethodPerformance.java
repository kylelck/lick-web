package com.lick.service;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年02月28日 17:36
 * @copyright: 版权归hsyuntai 所有
 */
public class MethodPerformance {
    private long begin;

    private long end;

    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance() {
        this.end = System.currentTimeMillis();
        long elapse = end - begin;

        System.out.println(serviceMethod + "花费" + elapse + "毫秒");
    }
}
