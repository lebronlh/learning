package leecode.Array;

//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
/*
* 注意：当从前往后移动的时候，后面每个字符都要移动；数量较大时可以考虑从后往前移动。
* 尽可能的保证数组长度小
* */
public class ReplaceSpace {
    public static void main(String[] args) {
        System.out.println(replaceSpace("we are family "));
    }

    public static String replaceSpace(String s) {
        /*int number =0;//空格数量
        for (int i =0;i<s.length();i++)
            if(s.charAt(i)==' ')
                number++;

        //统计出空格数量后，新建数组
        char[] fianlchar = new char[number*2+s.length()];

        //替换
        int size = 0;
        for (int i =0;i<s.length();i++)
            if(s.charAt(i)==' ') {
                fianlchar[size++] = '%';
                fianlchar[size++] = '2';
                fianlchar[size++] = '0';
            }else
                fianlchar[size++]=s.charAt(i);



        return new String(fianlchar,0,size);*/
        return  s.replace(" ","%20");
    }
}
