package designpattern.adapterpattern.card;

public class ThinkpadComputer implements Computer {
    @Override
    public String readSD(SDcard sdcard) {
        if(sdcard==null)throw new NullPointerException("sd card null");

        return sdcard.readSD();
    }

    @Override
    public int write(SDcard sdcard) {
        return  sdcard.writeSD("msg");
    }
}
