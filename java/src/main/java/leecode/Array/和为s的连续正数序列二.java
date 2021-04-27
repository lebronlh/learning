package leecode.Array;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 */
public class 和为s的连续正数序列二 {
    public int[][] findContinuousSequence(int target) {
        List<Integer[]> res = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();

        int sum = 3,i=0;
        temp.add(1);
        temp.add(2);
        while (temp.size()>1){
            if(sum>target) {
                sum-=temp.get(0);
                temp.remove(0);
            }
            else if(sum==target) {
                res.add(temp.toArray(new Integer[temp.size()]));
                sum-=temp.get(0);
                temp.remove(0);
            }
            else {
                temp.add(temp.get(temp.size() - 1) + 1);
                sum+=temp.get(temp.size()-1);
            }
        }
        int[][] transfer = transfer(res);
        return transfer(res);





    }

    private int[][] transfer(List<Integer[]> res) {
        int[][] r = new int[res.size()][];
        for(int i =0;i<res.size();i++){

            Integer[] integers = res.get(i);
            int[] ints = new int[integers.length];
            for(int j =0;j<integers.length;j++){
                ints[j]=integers[j];
            }
            r[i]=ints;
        }

        return  r;
    }

    @Test
    public void test(){
        int target =9;
        findContinuousSequence(target);
    }


}
