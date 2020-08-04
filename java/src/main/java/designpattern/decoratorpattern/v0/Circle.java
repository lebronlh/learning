package designpattern.decoratorpattern.v0;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
