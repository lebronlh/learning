package DesignPattern.Factory.SimpleFactory;

import java.util.Calendar;

public class CourseFactory {

   /* 1、普通实现
        缺点：如果业务继续扩展，比如增加c++课程，则create方法要继续修改，违反开闭原则
        public ICourse create(String name){
            if("java".equals(name))
                return new JavaCourse();
            else if("python".equals(name))
                return new PythonCourse();
            else
                return null;
    }*/

   /*//2、反射实现
           参数限定为字符串，可控性有待提升。
    public ICourse create(String classname){
        if(!(null==classname||"".equals(classname))) {
            try {
                return (ICourse) Class.forName(classname).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }*/

    public ICourse create(Class<? extends ICourse> clazz){
        if(null!=clazz){
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return  null;
    }


    /*
    简单工厂模式在jdk源码中的应用，例如Calendar类，Calendar.getInstance()
    * */
}
