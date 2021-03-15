package com.rohao.service.impl;

import com.rohao.service.UserService;
import org.springframework.stereotype.Service;

@Service("userservice")
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("调用save接口，存储数据");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        System.out.println("调用update接口");
    }
}
