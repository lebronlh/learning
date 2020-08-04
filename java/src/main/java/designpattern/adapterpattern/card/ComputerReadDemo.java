package designpattern.adapterpattern.card;

public class ComputerReadDemo {
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();

        SDcard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println(computer.write(sdCard));
        System.out.println("====================================");
        TFCard tfCard = new TFCardImpl();
        SDcard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
        System.out.println(computer.write(sdCard));
    }
}
