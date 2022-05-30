import java.util.*;
public class Matrix_TwoDarray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rows= in.nextInt();
        int cols= in.nextInt();
        int[][] arr= new int[rows][cols];
        //INPUTS
        //for rows:
        for (int i=0; i<rows; i++){
            //for columns:
            for (int j=0; j<cols; j++){
                arr[i][j]= in.nextInt();
            }
        }
        //OUTPUTS
        //for rows:
        for (int i=0; i<rows; i++) {
            //for columns:
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
