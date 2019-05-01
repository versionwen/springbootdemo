package com.wenxin.web;
import com.wenxin.Service.UserService;
import com.wenxin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
@RestController
@RequestMapping("user")
public class Controller {
    @Autowired
    private UserService userservice;
    //@GetMapping("hello.do")
    /*public String hello(){
        return "hello spring boot";
    }*/
    @GetMapping("{name}")
    public User name(@PathVariable("name") String name){
        User wx=new User();
        wx.setUsername(name);
        return userservice.selectUserbyname(wx);
    }
}

