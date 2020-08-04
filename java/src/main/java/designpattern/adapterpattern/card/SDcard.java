package designpattern.adapterpattern.card;

public interface SDcard {
    //读取SDcard的方法
    String readSD();
    //写入SD卡功能
    int writeSD(String msg);
}
