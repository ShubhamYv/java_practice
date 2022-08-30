import java.util.HashSet;
import java.util.Scanner;

public class _3_CountDistinctElements {
    public static int countDist(int[] arr, int n) {
        HashSet<Integer> h= new HashSet<>();
        for (int i = 0; i < n; i++) {
            h.add(arr[i]);
        }
        return h.size();
    }

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        int arr[]= {15, 12, 13,12, 13, 13,18};
        int n= arr.length;
        System.out.println(countDist(arr, n));
    }
}
