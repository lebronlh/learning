package effectivejava;

public class Random {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(-2147483648<0);
        System.out.println(-(-147483648));
        System.out.println(-(-2147483648));
        System.out.println(Math.abs(-2147483648));
    }
}
