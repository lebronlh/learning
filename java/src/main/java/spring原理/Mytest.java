package spring原理;

import org.junit.Test;
import spring原理.controller.UserController;
import spring原理.service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class Mytest {

    //原生反射
    @Test
    public void test() throws Exception{
        UserController userController = new UserController();

        Class<? extends UserController> clazz = userController.getClass();

        //创建对象
        UserService userService = new UserService();
        System.out.println(userService);
        //获取所有的属性
        Field serviceField = clazz.getDeclaredField("userService");

        serviceField.setAccessible(true);

        //只有通过方法才能设置具体属性的值
        String name = serviceField.getName();
        //拼接方法名称
        name = name.substring(0,1).toUpperCase()+name.substring(1,name.length());//userService--UserService
        String setMethodName = "set"+name;

        //通过方法注入属性的对象
        Method method = clazz.getDeclaredMethod(setMethodName, UserService.class);
        method.setAccessible(true);

        //反射
        method.invoke(userController, userService);//对象和参数
        System.out.println(userController.getUserService());
    }


    //注解实现
    @Test
    public void test1(){
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        UserService userService = new UserService();

        //获取所有属性
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            String name = field.getName();
            AutoWired annotation = field.getAnnotation(AutoWired.class);
            if(annotation!=null){
                field.setAccessible(true);
                //获取属性的类型
                Class<?> type = field.getType();
                try {
                    Object o = type.newInstance();
                    field.set(userController,o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());
    }
}
