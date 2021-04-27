import lh.entry.User;
import org.junit.Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
            //每次变换是扩大或者缩小2的n次幂倍
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//测试数据组数
        for(int i =0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int res = changeMin(a,b,c);
            System.out.println(res);
        }

    }

    public static int changeMin(int a,int b,int c){
        int res = 0;
        while(c!=0){
            int temp = c&1;
            int tempA =0;
            int tempB = 0;
            if(a!=0){
                tempA=a&1;
                a=a>>1;
            }

            if(b!=0){
                tempB=b&1;
                b=b>>1;
            }

            if(tempA==1&&tempB==1&&temp==0){
                res+=2;
            }else if((tempA==1||tempB==1)&&temp==0){
                res=+1;
            }else if(tempA==0&&tempB==0&&temp==1){
                res=+1;
            }
            c=c>>1;

        }
        return res;
    }


    @Test
    public void test(){
        Class<User> userClass = User.class;
        System.out.println(userClass.hashCode());
    }
}
