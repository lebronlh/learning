package leecode.剑指Offer;

public class 构建乘积数组 {
     public int[] buildArray(int a[]){
         if(a.length==0) return  new int[0];
         int b[] = new int[a.length];
         b[0]=1;
         int temp =1;
         //上三角
         for (int i =1;i<a.length;i++)
             b[i]=b[i-1]*a[i-1];

         //下三角
         for(int i =a.length-2;i>=0;i--){
             temp*=a[i+1];
             b[i]*=temp;
         }
         return b;



     }
}
