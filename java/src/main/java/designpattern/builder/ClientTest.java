package designpattern.builder;



public class ClientTest {
    public static void main(String[] args) {
        ShopBuilder builder =new ShopBuilder();
        Order order =builder.receive("火锅", (float) 21.7).packing().delively().build();
        System.out.println(order.toString());


    }
}
