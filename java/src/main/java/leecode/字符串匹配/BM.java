package leecode.字符串匹配;

import org.junit.Test;

/**
 * 思路：1、暴力匹配 2、BM哈希
 * 返回第一次完整匹配的时候，第一个字符的下标
 */
public class BM {
    public  int rabinKarp(String str, String pattern) {
        int a = str.length();//主串的长度
        int b = pattern.length();//子串的长度

        //计算子串的hashcode和主串第一次被子串匹配等长的子串hashcode
        int bHash=hashCount(pattern);
        int aHash=hashCount(str.substring(0,b));

        for(int i =0;i<a-b+1;i++){

            if(bHash==aHash&&comparString(str.substring(i,b+i),pattern))
                return i;

            if(i<a-b)
                aHash=nextHash(str,i,pattern,aHash);
        }

        return -1;
    }

    private int nextHash(String str, int i,String pattern,int hash) {
        return hash-str.charAt(i)+str.charAt(i+pattern.length());//后一个匹配子串的hash值是前一个减掉第一个加上最后一个
    }

    private boolean comparString(String substring, String pattern) {

        return substring.equals(pattern);
    }

    private  int hashCount(String c) {

        int hash = 0;
        for(int i =0;i<c.length();i++)
            hash+=c.charAt(i)-'a';
        return hash;
    }

    @Test
    public void test(){
        String a="abchisfdklj";
        String b ="hiskd";
        System.out.println(rabinKarp(a,b));
    }
}
