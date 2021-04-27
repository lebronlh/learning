package leecode.剑指Offer;

import java.util.Deque;
import java.util.LinkedList;

public class 滑动窗口59 {

    public int[] MaxWin(int[] num,int k){

        if(num.length==0||k==0)
            return new int[0];

        int res[] = new int[num.length-k+1];

        //用双端队列实现
        Deque<Integer> deque = new LinkedList<>();
        int max =num[0];
        for(int i =1-k,j=0;j<num.length;i++,j++){
            if(i>0 && deque.peekFirst()==num[i-1]){
                deque.removeFirst();
            }
            //保持deque递减
            while(!deque.isEmpty() && deque.peekLast()<num[j])
                deque.removeLast();
            deque.addLast(num[j]);
            //记录窗口最大值
            if(i>=0)
                res[i]=deque.peekFirst();
        }
        return res;

    }
}
