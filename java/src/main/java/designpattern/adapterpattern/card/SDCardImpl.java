package designpattern.adapterpattern.card;

public class SDCardImpl implements SDcard {
    @Override
    public String readSD() {
        String msg = "readSD is ok!";
        return msg;
    }

    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
