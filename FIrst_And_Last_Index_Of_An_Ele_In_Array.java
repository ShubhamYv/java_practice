import java.util.*;
public class FIrst_And_Last_Index_Of_An_Ele_In_Array {
    public static void indexOfEle(int arr[], int n, int ele){
        int first= -1;
        int last= -1;
        for(int i=0; i<n; i++){
            if(arr[i]== ele){
                if (first==-1){
                    first= i;
                } else{
                    last= i;
                    }
            }
        }
        System.out.print(first+" "+last);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int ele= sc.nextInt();
        indexOfEle(arr, n, ele);
    }
}
