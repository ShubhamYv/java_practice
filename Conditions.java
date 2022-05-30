import java.net.StandardSocketOptions;
import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter value of b: ");
        int b= sc.nextInt();
        if(a==b) {
            System.out.println("a is equal to b.");
        } else if (a>b){
            System.out.println("a is greater.");
        } else {
            System.out.println("b is greater.");
        }
    }
}
