package com.rohao.controller;

import com.rohao.Base.Restult;
import com.rohao.Domain.User;
import com.rohao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/userTest.do")
    public Restult<String> userTest(User user){
        Restult<String> restult = new Restult();
        restult.setData(user.toString());
        restult.setCode(0);
        restult.setMessage("success");
        return restult;

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertUser(){
        User user = new User();
        user.setName("aaaaa");
        user.setGrade("123456");
        userService.save(user);
    }
}
