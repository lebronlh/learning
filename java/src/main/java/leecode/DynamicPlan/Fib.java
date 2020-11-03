package leecode.DynamicPlan;

/**
 * 斐波拉契数列，递归会超时，空间复杂度过大
 */
public class Fib {

    public int fib(int n){
        /*if(n == 0 || n == 1)
            return n;
        else
            return fib(n-1)+fib(n-2);*/
        int a =0;
        int b =1;
        int sum;
        while(n>0){
            sum = (a+b)% 1000000007;
            a = b;//b值是上一个sum，赋予a后，故返回a
            b = sum;
            n--;
        }
        return a;
    }
}
