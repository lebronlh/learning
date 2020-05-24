package designpattern.factory.factorymethod;

import designpattern.factory.ICourse;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void test1(){
        IcourseFactory icourseFactory = new PythonFacory();
        ICourse course = icourseFactory.create();
        course.record();
    }
}
