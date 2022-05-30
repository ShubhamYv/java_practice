import java.util.*;
public class PrimeNum{
//    static int i=2;
    public static boolean isPrime(int n){
        if (n == 1 || n == 0) { //CORNER CASE
            return false;
        }
        for (int i=2; i<=n; i++) {  //i=2 because prime number starts from 2

            if (n % i == 0) { //BASE CASE
                return false;
            }

            if (n == i) {
                return true;
            }
//        i++; //if you want to use just remove for loop
        }
        return isPrime(n);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        System.out.println(isPrime(n));
    }
}