import java.util.*;
public class Factorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("Factorial of the number is: "+factorial(n));
        }

}
