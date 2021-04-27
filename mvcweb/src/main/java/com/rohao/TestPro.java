package com.rohao;

import com.rohao.Domain.User;
import com.rohao.controller.TestController;
import com.rohao.dao.UserMapper;
import com.rohao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPro {



    @Test
    public void test(){

        /*⾮web环境 (main junit) ：ClassPathXmlApplicationContext
            web环境 ：XmlWebApplicationContext*/

        /*
        * 控制：对于成员变量赋值的控制权；
            IOC,反转控制：把对于成员变量赋值的控制权，从代码中转移（反转）到 Spring ⼯⼚和配置⽂件中完成。
         好处：解耦合；
            底层实现：工厂设计模式；
*/
        //获取spring工厂
        /*底层原理是通过读取配置文件获取输入流，通过反射获取key（id,name）值 创建对象*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //User user = ctx.getBean("user", User.class);
        TestController controller = ctx.getBean("testController", TestController.class);
        User user = new User();
        controller.userTest(user);
        System.out.println(controller);

    }

    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        //方法一:
        //List<User> users = session.selectList("com.kuang.mapper.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void tsetSelectUserById() {
        SqlSession session = MybatisUtils.getSession();  //获取SqlSession连接
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void testTrancition(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //User user = ctx.getBean("user", User.class);
        TestController testController = ctx.getBean("testController", TestController.class);
        testController.insertUser();
    }


}
