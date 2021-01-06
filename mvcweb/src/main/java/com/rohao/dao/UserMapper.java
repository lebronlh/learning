package com.rohao.dao;

import com.rohao.Domain.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    User selectUserById(int id);
}
