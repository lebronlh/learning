package DesignPattern.Factory.SimpleFactory;

import org.junit.Test;

public class SimpleFactoryTest {
   /* @Test
      public void test1() {
        CourseFactory factory = new CourseFactory();
        factory.create("java").record();
        factory.create("python").record();
        factory.create("other");
    }*/

  /* @Test
     public void test2(){
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create("DesignPattern.Factory.SimpleFactory.JavaCourse");//全限定类名
        course.record();
    }*/

    @Test
    public void test3() {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }
}
