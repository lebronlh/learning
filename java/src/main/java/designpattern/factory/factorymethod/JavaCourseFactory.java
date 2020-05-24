package designpattern.factory.factorymethod;

import designpattern.factory.ICourse;
import designpattern.factory.JavaCourse;

public class JavaCourseFactory implements IcourseFactory {

    public ICourse create() {
        return new JavaCourse();
    }
}
