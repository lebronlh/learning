package designpattern.adapterpattern.card;

public interface Computer {
    String readSD(SDcard sdcard);

    int write(SDcard sdcard);
}
