package leecode.排序;

import org.junit.Test;

public class 冒泡 {

    private void sort(int[] array){
        for (int i=0;i<array.length;i++){
            boolean flag = true;
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        flag=false;
                    }
                }
            if(flag)
                break;
        }

    }


    @Test
    public void test(){
        int a[]={9,8,5,6,1,10,2,3,4};
        sort(a);
        for (int i : a) {
            System.out.printf("%d\t",i);
        }
    }
}
