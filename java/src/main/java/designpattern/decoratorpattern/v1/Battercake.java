package designpattern.decoratorpattern.v1;

/**
 * 煎饼类
 */
public  class Battercake implements Shop {
    public String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
