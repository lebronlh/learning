package designpattern.adapterpattern.card;

public class SDAdapterTF implements  SDcard {
    private  TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("TF adapter read");
        return tfCard.readTF();
    }

    @Override
    public int writeSD(String msg) {
        System.out.println("TF adapter write");
        return tfCard.writeTF(msg);
    }
}
