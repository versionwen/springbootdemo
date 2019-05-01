package com.wenxin.Configuration;

import com.wenxin.interceptor.myInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class mvcConfigur implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new myInterceptor()).addPathPatterns("/**");
    }
}
