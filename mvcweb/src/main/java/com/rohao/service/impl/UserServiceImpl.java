package com.rohao.service.impl;

import com.rohao.Domain.User;
import com.rohao.dao.UserMapper;
import com.rohao.service.UserService;
import com.rohao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(User user) {
        System.out.println("调用save接口，存储数据");
        SqlSession session = MybatisUtils.getSession();
        //方法一:
        //List<User> users = session.selectList("com.kuang.mapper.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = session.getMapper(UserMapper.class);
        userMapper.insertUser(user);
        session.commit();
        session.close();
    }

    @Override
    public void update() {
        System.out.println("调用update接口");
    }
}
