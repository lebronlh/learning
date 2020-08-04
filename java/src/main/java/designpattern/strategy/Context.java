package designpattern.strategy;

//环境类
public class Context {
    private  Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.startMethod();
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());
        context.strategyMethod();
    }
}
