package leecode.排序;

import org.junit.Test;

/**
 * 选基准，分治法；
 * 如果选的元素是最大或者最小，则最坏时间复杂度O（n平方）
 * 平均是nlogn
 */
public class 快排 {

    public void quickSort(int[] arr,int startIndex,int endIndex){
        if(startIndex>endIndex)
            return;

        //得到基准位置
        int pivot = partition(arr,startIndex,endIndex);
        //基准左边排序
        quickSort(arr,startIndex,pivot-1);
        //基准右边排序
        quickSort(arr,pivot+1,endIndex);
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        /**
         * 1、确定基准是第一个元素
         * 每次循环
         * 2、右指针于基准元素相比，比它大则不动，比他小则向左移
         * 3、左指针...
         *
         */
        int pivot=arr[startIndex];
        int left = startIndex;
        int right =endIndex;

        while (left!=right){
            while(arr[right]>pivot&&left<right)
                right--;
            while (arr[left]<pivot&&left<right)
                left++;

            if(left<right){
                int temp = arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
            }

        }
        //循环遍历完，交换基准元素和左右指针重合的值
        int temp = pivot;
        pivot =arr[left];
        arr[left]=temp;
        return left;
    }

    @Test
    public void test(){
        int a[]={1,4,23,5,2,3,6,24};
        quickSort(a,0,a.length-1);
        for (int i : a) {
            System.out.printf("%d\t",i);
        }
    }


}
