package leecode.排序;

import org.junit.Test;

import java.util.Arrays;

public class 插入排序 {
    public void insertSort(int[] arr){
        //插入的元素应该是第二个元素开始
        for(int i =1;i<arr.length;i++){
            //维护有序数组
            int insertValue =arr[i];
            int j =i-1;
            for(;j>=0&&insertValue<arr[j];j--){
                    arr[j+1]=arr[j];
            }
            arr[j+1]=insertValue;
        }
    }

    @Test
    public void test(){
        int a[] = {1,4,9,3,5,8,6,2};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
}
