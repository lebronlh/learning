package leecode;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *
 * 请找出其中最小的元素。
 *
 * 注意数组中可能存在重复的元素。
 *
 */
public class FindMin {
    public static void main(String[] args) {
        int[] nums ={3,1,3};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        while (first<last) {
            int mid = (first + last) / 2;
            if(nums[last]>nums[mid]){
                last = mid;
            }else if(nums[last]<nums[mid]){
                first = mid+1;
            }else{
                last = last -1;
            }
        }
        return nums[first];
    }
}
