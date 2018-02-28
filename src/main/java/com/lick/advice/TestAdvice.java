package com.lick.advice;

import com.lick.service.MethodPerformance;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年02月28日 17:35
 * @copyright: 版权归hsyuntai 所有
 */
public class TestAdvice {
    // 通过一个ThreadLocal保存调用线程相关的性能监视信息
    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

    // 启动对一目标方法的性能监视
    public static void begin(String method) {
        System.out.println("begin monitor...");
        MethodPerformance mp = new MethodPerformance(method);
        performanceRecord.set(mp);
    }

    public static void end() {
        System.out.println("end monitor...");
        MethodPerformance mp = performanceRecord.get();
        mp.printPerformance();
    }
}
