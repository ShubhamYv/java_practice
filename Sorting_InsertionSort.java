import java.util.*;
public class Sorting_InsertionSort {
    public static void insertionSort(int arr[], int n){
        for(int i=1; i<n; i++){
            int current= arr[i];
            int j= i-1;
            while(j >=0 && current < arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= current;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        insertionSort(arr, n);
        printArr(arr, n);
    }

    public static void printArr(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
