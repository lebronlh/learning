package leecode.排序;

import org.junit.Test;

public class 归并 {

    public void mergeSort(int[] array, int start, int end) {
        if(start<end) {
            int mid = (end + start) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }


    private void merge(int[] array, int start, int mid, int end) {

        int[] tempArray = new int[end - start + 1];
        int i = 0;
        int left = start;
        int pMid = mid+1;
        int right = end;
        while (left <= mid && pMid <= right) {
            if (array[left] < array[pMid])
                tempArray[i++] = array[left++];
            else {
                tempArray[i++] = array[pMid++];
            }
        }




        //如果左边装完了，右边没装完
        while (pMid <= right) {
            tempArray[i++] = array[pMid++];
        }


            while (left <= mid) {
                tempArray[i++] = array[left++];
            }



        for (int j = 0; j < tempArray.length; j++)
            array[j + start] = tempArray[j];


    }


    @Test
    public void test(){
        int a[]={1,4,23,5,2,3,6,24};
        mergeSort(a,0,a.length-1);
        for (int i : a) {
            System.out.printf("%d\t",i);
        }
    }
}
