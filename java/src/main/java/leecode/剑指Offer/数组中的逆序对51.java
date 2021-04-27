package leecode.剑指Offer;

public class 数组中的逆序对51 {
    //分治，归并算法的思想
    public int reversePairs(int[] nums) {
        int len = nums.length;

        if(len<2)
            return 0;

        int[] copy = new int[len];
        for(int i =0;i<copy.length;i++)
            copy[i]=nums[i];

        //归并需要临时数组
        int[] tmp = new int[len];
        return reversePairs(copy,0,len-1,tmp);
    }

    private int reversePairs(int[] nums, int left, int right, int[] tmp) {

        if(left==right)
            return 0;

        int mid = left+(right-left)/2;//预防大数相加内存溢出
        int leftPairs = reversePairs(nums, left, mid, tmp);
        int rightPairs = reversePairs(nums, mid + 1, right, tmp);

        //优化:如果提前确定左边的有序数组小于右边的，则可以提前返回
        if(nums[mid]<=nums[mid+1]){
            return leftPairs+rightPairs;
        }
        int crossPairs = mergeAndCount(nums,left,mid,right,tmp);
        return leftPairs+rightPairs+crossPairs;
    }

    /**
     * nums[left....mid]有序，nums[mid+1,right]有序
     * @param nums
     * @param left
     * @param mid
     * @param right
     * @param tmp
     * @return
     */
    private int mergeAndCount(int[] nums, int left, int mid, int right, int[] tmp) {
        //拷贝到辅助数组
        for(int i =left;i<=right;i++){
            tmp[i]=nums[i];
        }
        int i = left;
        int j = mid+1;
        int count =0;

        for(int k= left;k<=right;k++){
            if(i==mid+1){
                nums[k]=tmp[j++];
            }else if(j==right+1) {
                nums[k]=tmp[i++];
            }else if(tmp[i]<=tmp[j]){
                nums[k]=tmp[i++];
            }else{
                //右边更小，则归并后要计数逆序对
                nums[k]=tmp[j++];
                count +=(mid-i+1);//核心代码
            }
        }
        return  count;
    }
}
