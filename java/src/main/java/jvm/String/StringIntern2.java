package jvm.String;

public class StringIntern2 {

    /**
     * 空间效率测试
     */

    static final int MAX_count = 1000 * 1000;
    static final String[] arr = new String[MAX_count];

    public static void main(String[] args) {
        //int[] data = {1,2,3,4,5,6,7,8,9};
        Integer[] data = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        long start = System.currentTimeMillis();
        for(int i =0;i<MAX_count;i++){
            //arr[i] = new String(String.valueOf(data[i%data.length]));
            //arr[i] = String.valueOf(data[i%data.length]);
            arr[i] = new String(String.valueOf(data[i%data.length])).intern();
        }

        long end =System .currentTimeMillis();
        System.out.println("花费的时间："+(end -start));
    }
}
