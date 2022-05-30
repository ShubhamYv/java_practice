import java.util.*;
public class SearchEleInArray {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= in.nextInt();
        System.out.print("Enter the elements in array: ");
        int arr[]= new int[n];

        //INPUT
        for(int i=0; i<n; i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target= in.nextInt();

        //OUTPUT
        for(int i=0; i<arr.length; i++){
            if (arr[i] == target){
               System.out.println("Element found at: " + i);
            }
        }

    }
}
