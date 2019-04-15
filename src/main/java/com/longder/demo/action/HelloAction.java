package com.longder.demo.action;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@EqualsAndHashCode(callSuper = true)
@Namespace("/hello")
@Data
public class HelloAction extends BaseAction{

    private String testValue;
    @Action(value = "toLogin",results = {
            @Result(name = "success",location = "templates/hello.jsp")
    })
    public String test(){
        System.out.println("进入login");
        return "success";
    }

    @Action(value = "world")
    public String world(){
        System.out.println("进入world");
        return "success";
    }

}
