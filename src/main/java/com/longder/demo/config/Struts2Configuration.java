package com.longder.demo.config;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.DispatcherType;

@Configuration
public class Struts2Configuration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> registration = new FilterRegistrationBean();
        registration.setFilter(new StrutsPrepareAndExecuteFilter());
        //所有请求都交给struts2了
        registration.addUrlPatterns("/*");
        registration.addInitParameter("actionPackages","com.longder.demo.action");
        registration.setName("StrutsPrepareAndExecuteFilter");
        return registration;
    }

}
