package leecode.DynamicPlan;

/**
 * 青蛙跳台阶问题
 * 只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法
 * 思路：动态规划 f（n） = f(n-1)+f(n-2)
 */
public class Frog {
    //f(0) = 1;f(1) = 1;f(2 ) = 2

    public static int numWays(int n) {
        if(n==0)
            return 1;
        else if(n==1||n==2)
            return n;
        else
            return numWays(n-1)%1000000007+numWays(n-2)%1000000007;
    }

    public static void main(String[] args) {
        System.out.println(numWays(3));
    }
}
