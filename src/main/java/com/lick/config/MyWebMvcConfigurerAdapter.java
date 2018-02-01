package com.lick.config;

import com.lick.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年01月16日 15:47
 * @copyright: 版权归hsyuntai 所有
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    /**
     * @description: 增加拦截器
     * @method: addInterceptors
     * @params: [registry]
     * @returnType: void
     * @author: lick@hsyuntai.com
     * @date: 2018/1/23 10:24
     * @copyright: 版权归hsyuntai 所有
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
