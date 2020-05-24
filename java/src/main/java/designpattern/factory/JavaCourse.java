package designpattern.factory;

import designpattern.factory.ICourse;

public class JavaCourse implements ICourse {
    public void record() {
        System.out.println("录java课");
    }
}
