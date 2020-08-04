package designpattern.decoratorpattern.v0;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redRectangleShapeDecorator = new RedShapeDecorator(new Rectangle());
        RedShapeDecorator redCircleShapeDecorator = new RedShapeDecorator(circle);
        redCircleShapeDecorator.draw();
        redRectangleShapeDecorator.draw();
    }
}
