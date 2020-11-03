package leecode.Array;

public class FindNumberIn2DArray {
    public static void main(String[] args) {

        int test[][] = {{}

};
        int target =1;
        System.out.println(findNumberIn2DArray(test,target));

    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0|| matrix[0].length==0)
            return false;

        int i =0;
        int j =matrix[0].length-1;
        int right = 0;

        while(true) {
            right = matrix[i][j];//右上角的值
            if (right == target)
                return true;
            else if (right > target) {
                //如果大于目标，则往左移
                j--;
            }else {
                //如果小于目标，则往下移
                i++;
            }

            if(i>(matrix.length-1)||j<0)
                return false;
        }
    }
}
