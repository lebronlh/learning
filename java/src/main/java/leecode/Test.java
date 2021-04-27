package leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test{
   static  Map<Character, Integer> map = new HashMap<>();
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();


      map.put('C', 12);
      map.put('H', 1);
      map.put('O', 16);
      map.put('N', 14);

      int len = s.length();

      int res = 0;
      for(int i =0;i<len;i++){
         if(i<len-1){
            if(map.get(s.charAt(i+1))==null){
               int ab = array(s,i+1);
               int a =1;
               int count =0;
                for(int j = ab;j>=i+1;j--){
                   count+=(s.charAt(j)-'0')*a;
                   a*=10;
                }
                res+=map.get(s.charAt(i))*count;
                i=ab;
            }else{
               res = map.get(s.charAt(i));
            }
         }else if(map.get(s.charAt(i))!=null){
            res+=map.get(s.charAt(i));
         }
         System.out.println(res);
      }

   }

    static int array(String s, int i) {
      for(int j =i;j<s.length();j++){
         if(map.get(s.charAt(j))!=null){
            return j-1;
         }
      }
      return s.length()-1;
   }





}