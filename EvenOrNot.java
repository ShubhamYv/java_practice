import java.util.*;
public class EvenOrNot {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check even or not??? ");
        int n= sc.nextInt();
        System.out.println(isEven(n));

    }
}
