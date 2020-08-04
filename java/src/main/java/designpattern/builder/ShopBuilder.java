package designpattern.builder;

public class ShopBuilder implements Shop {

    private Order order =new Order();

    @Override
    public ShopBuilder receive(String name,Float price) {
        order.setName(name);
        order.setPrice(price);
        return this;
    }

    @Override
    public ShopBuilder packing() {
        order.setPacking("塑料袋");
        return this;
    }

    @Override
    public ShopBuilder delively() {
        order.setDeleily("外卖派送");
        return this;
    }

    public Order build(){
        return order;
    }
}
