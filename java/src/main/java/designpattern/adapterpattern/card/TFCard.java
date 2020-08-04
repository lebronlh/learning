package designpattern.adapterpattern.card;

public interface TFCard {
    String readTF();
    int writeTF(String msg);
}
