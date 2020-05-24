package designpattern.factory.factorymethod;

import designpattern.factory.ICourse;
import designpattern.factory.PythonCourse;

public class PythonFacory implements IcourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
