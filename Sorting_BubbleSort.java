import java.util.*;
public class Sorting_BubbleSort {
    public static void bubbleSort(int arr[], int n){
        for(int i=0; i< n; i++){
            int swap=0;
            for (int j=0; j<n-i-1; j++){
                if(arr[j]> arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap+=1;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        bubbleSort(arr, n);
        printArr(arr, n);
    }

    static void printArr(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
