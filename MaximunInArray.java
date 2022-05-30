import java.util.*;
public class MaximunInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size= in.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i=0; i<size; i++){
            arr[i]= in.nextInt();
        }
//        int max= Integer.MIN_VALUE;
//        int min= Integer.MAX_VALUE;
        int max= -1;
        int min= 10000;
        for (int i=0; i<arr.length; i++){
            if (arr[i]> max) {
                max= arr[i];
            }
            if (arr[i] < min){
                min= arr[i];
            }
        }
        System.out.println("Maximum element of array is: "+max);
        System.out.println("Minimum element of array is: "+min);
    }
}
