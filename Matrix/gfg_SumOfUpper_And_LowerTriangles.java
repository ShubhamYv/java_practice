import java.util.Scanner;

public class gfg_SumOfUpper_And_LowerTriangles {
    public static void sumOfUpperLower(int[][] mat ){
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i<=j) {
                    sum1 += mat[i][j];
                }
                if (i>=j){
                    sum2+= mat[i][j];
                }
            }
        }
        System.out.println("upper: "+ sum1);
        System.out.println("Lower: "+ sum2);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = 3;
        int[][] mat={{6, 5, 4},
                    {1, 2, 5},
                    {7, 9, 7}};
        sumOfUpperLower(mat);
    }
}
