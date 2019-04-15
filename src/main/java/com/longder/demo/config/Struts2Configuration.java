package com.longder.demo.config;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

@Configuration
public class Struts2Configuration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> registration = new FilterRegistrationBean();
        registration.setFilter(new StrutsPrepareAndExecuteFilter());
        registration.addUrlPatterns("*");
        registration.addInitParameter("actionPackages","com.longder.demo.action");
        registration.setDispatcherTypes(DispatcherType.REQUEST,DispatcherType.FORWARD);
        registration.setName("StrutsPrepareAndExecuteFilter");
        return registration;
    }

}
