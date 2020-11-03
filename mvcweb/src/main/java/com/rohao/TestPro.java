package com.rohao;

import com.rohao.Domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        User user = ctx.getBean("user", User.class);
        System.out.println(user);

    }
}
