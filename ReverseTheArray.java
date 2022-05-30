import java.util.*;
public class ReverseTheArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int low=0, high=n-1;
        while(low< high){
            int temp=arr[low];
            arr[low]= arr[high];
            arr[high]= temp;
            low++;
            high--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
