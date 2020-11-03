package leecode;

public class Solution {

    private  static  int count = 0;
    public static int movingCount(int m, int n, int k) {
        int[][] vis =new int[m][n];
        dfs(vis,0,0,k);

        return count;
    }

    public static void dfs(int[][]conv,int m,int n,int k){
        if(transfer(m)+transfer(n)>k|| m>conv.length-1 || n>conv[0].length-1 ||conv[m][n]==-1)
            return ;
        count++;
        conv[m][n]=-1;
        dfs(conv,m+1,n,k);
        dfs(conv,m,n+1,k);
    }

    public static int transfer(int num){
        int res = 0;
        while (num!=0) {
            res += num % 10;
            num/=10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(3, 1, 0));
    }
}
