package leecode;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    
        public static void main(String[] args){
//            Scanner in = new Scanner(System.in);
//            String str = in.next();
            String str = "((jhku)(love)i)";

            char[] chars = str.toCharArray();
            Arrays.toString(chars).replace("(", "").replace(")", "").replace(",","");



            Stack<Integer> stack = new Stack<>();
            for(int i =0;i<chars.length;i++){
                if(chars[i]=='('){
                    stack.push(i);
                }
                if(chars[i]==')'){
                    Integer pop = stack.pop();
                    reverse(chars,pop,i);
                }

            }

            String s = Arrays.toString(chars).replace("(", "").replace(")", "").replace(", ","");
            //String replace = chars.toString().replace("(", "").replace(")", "");
            System.out.println(s.substring(1,s.length()-1));


        }

        public static void reverse(char[] chars,int pop,int i){
            int left = pop+1;
            int right = i-1;

            while(left<right){
                exchange(chars,left,right);
                left++;
                right--;
            }
        }

    private static void exchange(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left]=chars[right];
        chars[right]=temp;
    }


}



