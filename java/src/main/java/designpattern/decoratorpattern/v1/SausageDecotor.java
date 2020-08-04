package designpattern.decoratorpattern.v1;

public class SausageDecotor extends BattercakeDecorator {
    public SausageDecotor(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+3;
    }
}
