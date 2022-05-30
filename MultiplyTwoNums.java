import java.util.*;

public class MultiplyTwoNums {
    public static int calculateMul(int num1, int num2) {
//        int mul= num1* num2;
//        return mul;
        return num1*num2;
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("Enter num1: ");
         int num1 = in.nextInt();
         System.out.print("Enter num2: ");
         int num2 = in.nextInt();
         int mul= calculateMul(num1, num2);
         System.out.println("Multiplication of two number is: "+mul);
    }

}
