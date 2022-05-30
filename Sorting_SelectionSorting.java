import java.util.*;
public class Sorting_SelectionSorting {
    public static void selectionSort(int arr[], int n){
        //SELECTION SORT
        for(int i=0; i<n; i++){
            int smallest= i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest]> arr[j]){
                    smallest= j;
                }
            }
            int temp= arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        selectionSort(arr, n);
        printArr(arr, n);
    }

    public static void printArr(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
