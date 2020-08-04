package com.rohao.controller;

import com.rohao.Base.Restult;
import com.rohao.Domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/userTest.do")
    public Restult<String> userTest(User user){
        Restult<String> restult = new Restult();
        restult.setData(user.toString());
        restult.setCode(0);
        restult.setMessage("success");
        return restult;

    }
}
