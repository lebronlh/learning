package com.rohao.service.impl;

import com.rohao.service.TaskService;
import org.springframework.stereotype.Service;

@Service("taskservice")
public class TaskServiceImpl implements TaskService {
    @Override
    public void firstTask() {
        System.out.println("第一个定时任务执行了");
    }

    @Override
    public void secondTask() {
        System.out.println("第二个定时任务执行了");
    }
}
