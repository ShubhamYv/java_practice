import java.util.*;
public class Recursion_IsTheArraySorted {
    public static boolean isSorted(int arr[], int ind){
        if (arr[ind]== arr.length-1){
            return true;
        }
        if(arr[ind]>= arr[ind+1]){
            return false;
        }
        return isSorted(arr, ind+1);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(isSorted(arr, 0));
    }
}
