package spring原理.controller;


import spring原理.AutoWired;
import spring原理.service.UserService;

public class UserController {


    @AutoWired
    private UserService userService;



    public UserService getUserService() {
        return userService;
    }

    private void setUserService(UserService userService) {
        this.userService = userService;
    }
}
