package leecode;


import org.junit.Test;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int aab=0;
        int time =0;
        int start =0;int end;

        Set<List<Integer>> set = new HashSet<>();
        List<Integer> all = new ArrayList<>();
        all.add(nums[0]);

        for(int j =0;j<nums.length;j++){
            time++;
            if(nums[j-1]-nums[j]>=9){
                if(aab==0)
                    start=Math.max(j-4,0);
                aab++;
                if(aab>=4)
                    time =0;
            }else{
                if(aab>=4){
                    List<Integer> integers = new ArrayList<>();
                    end =j;
                    end = Math.min(end+4,nums.length);
                    for(int k =start;k<end;k++){
                        integers.add(nums[j]);
                    }
                    aab=0;
                    time=0;
                    if(set.add(integers)){
                        all.addAll(integers);
                    }
                }
            }
            if(time==60){
                all.add(nums[j]);
                time =0;
            }
        }
        System.out.println(all.toString());
    }






    @Test
    public void test() {
        int nums[] ={7,1,5,3,6,4};



    }

}

