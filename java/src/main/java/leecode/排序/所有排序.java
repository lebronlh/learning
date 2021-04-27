package leecode.排序;

import org.junit.Test;

import java.util.Arrays;

public class 所有排序 {
    //快排

    public void quickSort(int arr[],int startIndex,int endIndex){
        //递归出口
        if(startIndex>=endIndex)
            return;
        //获取基准位置
        int pivotIndex = getPiv(arr,startIndex,endIndex);
        quickSort(arr,startIndex,pivotIndex-1);
        quickSort(arr,pivotIndex+1,endIndex);
    }

    private int getPiv(int[] arr, int startIndex, int endIndex) {
        int temp = arr[startIndex];
        //从右指针开始遍历
        while (startIndex!=endIndex){
            while (startIndex<endIndex&&arr[endIndex]>temp){
                endIndex--;
            }


            while (startIndex<endIndex&&arr[startIndex]<=temp){
                //刚开始相等一定向右移动一位
                startIndex++;
            }

            //左右指针交换
            if(startIndex<endIndex){
                arr[startIndex]^=arr[endIndex];
                arr[endIndex]^=arr[startIndex];
                arr[startIndex]^=arr[endIndex];
            }
        }
        //基准元素和重合指针交换
        arr[startIndex]^=temp;
        temp^=arr[startIndex];
        arr[startIndex]^=temp;

        return startIndex;
    }


    @Test
    public void test(){
        int a[] = {1,4,9,3,5,8,6,2};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void test1(){
        int a =4;
        int b =8;
        a^=b;
        b^=a;
        a^=b;
        System.out.println(a);
        System.out.println(b);
    }
}
