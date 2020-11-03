package leecode.Array;

/**
 * 找出数组中重复的数字
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *

 */
public class RepeatNumber {
    public static void main(String[] args) {

    }

    //一个萝卜一个坑，如果交换过程发现相等即是重复数字
    public int findRepeatNumber(int[] nums){
        int  temp;
        for(int i =0;i<nums.length;i++){
            while(i!=nums[i]){
                if( nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp = nums[i];
                nums[i]=nums[temp];
                nums[temp] = temp;
            }
        }
        return 1;
    }
}
