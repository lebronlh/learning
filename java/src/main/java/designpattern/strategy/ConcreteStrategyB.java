package designpattern.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void startMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
