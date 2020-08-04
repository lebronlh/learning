package lh.entry;

public class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }


    public static Complex valueof(double re, double im){
        return new Complex(re,im);
    }

    public static void main(String[] args) {
        Complex v1 = Complex.valueof(1.2, 1.3);
        Complex v2 = Complex.valueof(1.2, 1.3);
        System.out.println(v1==v2);

    }
}
