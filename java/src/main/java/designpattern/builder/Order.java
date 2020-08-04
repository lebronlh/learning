package designpattern.builder;
//订单类
public class Order {
    private  String name;
    private  float price;
    private  String packing;
    private  String deleily;

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public String getDeleily() {
        return deleily;
    }

    public void setDeleily(String deleily) {
        this.deleily = deleily;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", packing='" + packing + '\'' +
                ", deleily='" + deleily + '\'' +
                '}';
    }
}
