package leecode.排序;

import org.junit.Test;

import java.util.Arrays;

public class 归并Test {

    public void mergeSort(int[] nums,int left,int right,int[] temp){
        if(left==right)
            return;
        //int mid = (right+left)/2;
        int mid = left+(right-left)/2;
        mergeSort(nums,left,mid,temp);
        mergeSort(nums,mid+1,right,temp);
        merge(nums,left,mid,right,temp);
    }

    private void merge(int[] nums, int left, int mid, int right,int[] tmp) {
        //创建辅助数组
        int l = left;
        int m = mid+1;
        for(int i=left;i<=right;i++){
            tmp[i]=nums[i];
        }

        for(int k =left;k<=right;k++){
            if(l==mid+1){
                nums[k]=tmp[m++];
            }else if(m==right+1){
                nums[k]=tmp[l++];
            }else if(tmp[l]<=tmp[m]){
                nums[k]=tmp[l++];
            } else {
                nums[k]=tmp[m++];
            }
        }
    }

    @Test
    public void test(){
        int a[] = {1,4,9,3,5,8,6,2};
        int temp[] = new int[a.length];
        mergeSort(a,0,a.length-1,temp);
        System.out.println(Arrays.toString(a));
    }
}
