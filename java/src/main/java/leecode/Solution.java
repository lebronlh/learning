package leecode;

public class Solution {

    public int[] twoSum (int[] numbers, int target) {
        for(int i =0;i<numbers.length;i++){
            for (int j =1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {2,11,7,15};
        int target = 26;
        int[] sum = solution.twoSum(numbers, target);
        System.out.println("index1="+sum[0]);
        System.out.println("index2="+sum[1]);
    }
}
