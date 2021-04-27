package leecode.排序;

import org.junit.Test;

import java.util.Arrays;

/**
 * 堆排序
 * 1. 把无序数组构建成二叉堆。
 * 2. 循环删除堆顶元素，移到集合尾部，调节堆产生新的堆顶。
 *
 * 以顺序排序为例，先构建大顶堆，再循环删除堆顶元素都末尾
 */
public class 排序Test {

    //归并排序
    public void mergeSort(int[] array,int left,int right){
        //递归终止条件
        if(left==right)
            return;

        int mid = left+(right-left)/2;
        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,mid,right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        int tempArray[] = new int[right-left+1];

        int m =mid+1;
        int l =left;
        int r =right;
        int j =0;

        while(l<mid+1&&m<=right){
            if (array[l]<array[m]){
                tempArray[j++]=array[l++];
            } else{
                tempArray[j++]=array[m++];
            }
        }

        while(l<=mid){
            tempArray[j++]=array[l++];
        }

        while (m<=right){
            tempArray[j++]=array[m++];
        }

        for(int i=0;i<tempArray.length;i++){
            array[i+left]=tempArray[i];
        }


    }

    @Test
    public void test(){
        int a[] = {1,4,9,3,5,8,6,2};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

}
