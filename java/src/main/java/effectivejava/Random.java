package effectivejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Random {
    public static void main(String[] args) {
       int n = 8;
       int m = 4;

        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(5);
        integers.add(9);
        System.out.println(integers);

        int min = 1;
        int i = 0;
        while (i < integers.size()) {
            if (integers.contains(min)) {
                min++;
                continue;
            } else {
                if (integers.size() == n) {
                    break;
                }

                if (min < integers.get(i)) {
                    //integers.add(i + 1, integers.get(i));
                    integers.add(i, min);
                    min++;
                }
                i++;
            }
        }

        System.out.println(integers);




    }

    void aa(int n,int m,Integer[] arr){
        int min = 1;
        List<Integer> integers = Arrays.asList(arr);
        if(n<0||m<0){
            return;
        }
        if(arr.length!=m)
            return;

        int result[] =new int[n];
        int j =0;
        for (int i =0;i<arr.length;i++) {
            while (integers.contains(min)) {
                min++;
            }
            if(arr[i]<min)
                result[j++] = arr[i];
             else {
                result[j++] = min;
                min++;
            }

             if(i==arr.length-1){
                 while (j<n){

                 }
             }


        }








    }


}
