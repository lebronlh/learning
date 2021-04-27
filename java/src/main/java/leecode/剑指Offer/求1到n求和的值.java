package leecode.剑指Offer;

import org.junit.Test;

public class 求1到n求和的值 {
    //不能用条件判断，循环语句
    public int sumNums(int n){
        boolean flag = n>0 && (n += sumNums(n-1))>0;
        return n;
    }

    @Test
    public void test(){
        System.out.println(sumNums(5));
    }
}
