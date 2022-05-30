import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b= sc.nextInt();
        int sum= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        int n= sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Addition of two number is: ");
                System.out.println(sum);
                break;
            case 2:
                System.out.print("Subtraction of two number is: ");
                System.out.print(sub);
                break;
            case 3:
                System.out.print("Multiplication of two number is: ");
                System.out.println(mul);
                break;
            case 4:
                System.out.print("Division of two number is: ");
                System.out.println(div);
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}
