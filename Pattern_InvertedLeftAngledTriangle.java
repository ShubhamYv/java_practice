import java.util.Scanner;

public class Pattern_InvertedLeftAngledTriangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=4;
        //for rows
        for(int i=1; i<=n; i++) {
            //for spaces
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            //for star print
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
