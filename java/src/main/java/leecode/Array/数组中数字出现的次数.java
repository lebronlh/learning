package leecode.Array;

import org.junit.Test;

public class 数组中数字出现的次数 {
    public int[] singleNumbers(int[] nums) {
        int temp = 0;
        for(int num: nums){
            temp^=num;
        }

        //找到异或运算后值得任意一位为1的位
        int res = 1;
        while((temp & res)==0)
            res<<=1;

        int a=0,b=0;
        for(int num: nums){
            if((num & res)==0)
                a^=num;
            else
                b^=num;
        }
        return new int[]{a,b};
    }


    @Test
    public void test(){
        int a =1;
        int b =1;
        int i = a & b;
        System.out.println(a==i);
        System.out.println((a&b)==a);
    }
}
