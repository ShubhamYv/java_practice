import java.util.*;
public class SumOfOddNum1toN {
    public static void sumOfOddNum(int n) {
        int sum=0;
        for(int i=0; i<=n; i++){
            if(i%2!=0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sumOfOddNum(n);
    }
}
