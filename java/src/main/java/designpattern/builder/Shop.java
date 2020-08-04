package designpattern.builder;

public interface Shop {
    //接收订单
    ShopBuilder receive(String name,Float price);
    //打包
    ShopBuilder packing();
    //配送
    ShopBuilder delively();
}
