import java.util.Scanner;

public class gfg_RotateMatrixBy_90Degree__ANTICLOCKWISE {
    public static void rotateMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {

            //Transpose
            for (int j =i+1; j <mat[0].length; j++) {
                int temp= mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]= temp;
            }
            //Reverse
            int low=0, high= mat.length-1;
            while (low< high) {
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=3;
        int[][] mat={{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        rotateMat(mat);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
