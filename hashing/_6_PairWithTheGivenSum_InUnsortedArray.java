import java.util.HashSet;

public class _6_PairWithTheGivenSum_InUnsortedArray {
    public static boolean sumOrNot(int arr[], int n, int sum){
        HashSet<Integer> h= new HashSet<>();
        for (int i=0; i<n; i++){
            if (h.contains(sum- arr[i]))
                return true;
            h.add(arr[i]);
        }
        return false;
    }
    public static void main(String args[]) {
        int arr[]= {3, 2, 8, 15, -8};
        int sum=17;
        int n= arr.length;
        System.out.println(sumOrNot(arr, n, sum));
    }
}
