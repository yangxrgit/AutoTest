package com.course.server;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController //表明是被扫描的类
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET) //设定访问路径、访问方法
    public String getCookies(HttpServletResponse response){

        //HttpServletRequest 装请求信息的类
        //HttpServletResponse 装响应信息的类

        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);

        return "恭喜你获得cookies信息成功";
    }
}
