import java.util.*;
public class TableOfGivenNumber {
    public static void tableOfaNum(int n) {
        for (int i=1; i<=10; i++) {
            System.out.println((i*n)+" ");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        tableOfaNum(n);
    }
}
