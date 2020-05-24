package designpattern.factory.abastractfactory;

public class JavaCourseFactory implements IcourseFactory{
    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
