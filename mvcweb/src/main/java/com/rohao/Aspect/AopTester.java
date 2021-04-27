package com.rohao.Aspect;

import com.rohao.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AopTester {
    @Autowired
    UserService userService;
    @Autowired
    ApplicationContext context;



    @Test
    public void test(){
        System.out.println("------------");
        userAspect aspect = context.getBean(userAspect.class);
        System.out.println(aspect);
        //userService.save();
        System.out.println("--------------");
    }
}
