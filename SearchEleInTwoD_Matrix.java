import java.util.*;

public class SearchEleInTwoD_Matrix {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row= in.nextInt();
        System.out.print("Enter the number of columns: ");
        int col= in.nextInt();
        System.out.println("Enter the number in the array: ");
        int[][] arr= new int[row][col];
        for(int i=0; i< row; i++){
            for(int j=0; j< col; j++){
                arr[i][j]= in.nextInt();
            }
        }
        System.out.print("Enter an element to be searched: ");
        int target= in.nextInt();
        for (int i=0; i<row; i++) {
            //for columns:
            for (int j = 0; j < col; j++) {
                if(arr[i][j]== target) {
                    System.out.println("Target found at location(" + i + ", " + j + ")");
                }
            }
        }
    }
}
