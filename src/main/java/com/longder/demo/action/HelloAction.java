package com.longder.demo.action;

import com.longder.demo.service.TestService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@EqualsAndHashCode(callSuper = true)
@Namespace("/")
@Data
@Controller
public class HelloAction extends BaseAction{

    private String testValue;

    @Resource
    private TestService testService;

    @Action(value = "",results = {
            @Result(name = "success",type = "redirect",location = "toLogin")
    })
    public String index(){
        return "success";
    }

    @Action(value = "toLogin",results = {
            @Result(name = "success",location = "/hello.jsp")
    })
    public String test(){
        System.out.println("testValue:");
        System.out.println(testValue);
        System.out.println("进入login");
        testService.test();
        return "success";
    }

    @Action(value = "world")
    public String world(){
        System.out.println("进入world");
        return "success";
    }
}
