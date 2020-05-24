package designpattern.factory;

import designpattern.factory.ICourse;

public class PythonCourse implements ICourse {
    public void record() {
        System.out.println("python");
    }
}
