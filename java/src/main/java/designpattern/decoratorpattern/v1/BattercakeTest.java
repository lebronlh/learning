package designpattern.decoratorpattern.v1;

public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();

        battercake = new EggDecorator(battercake);
        battercake = new SausageDecotor(battercake);
        System.out.println(battercake.getMsg());
        System.out.println(battercake.getPrice());


    }
}
