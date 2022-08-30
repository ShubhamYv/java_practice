import java.util.HashSet;

public class _5_UnionOfTwoUnsortedArray {
    public static int countDistinct(int arr1[], int arr2[]) {
        int n= arr1.length;
        int m= arr2.length;
        HashSet<Integer> h= new HashSet<>();
        for (int i=0; i<n; i++)
            h.add(arr1[i]);
        for (int j=0; j<m; j++)
            h.add(arr2[j]);
        return h.size();
    }

    public static void main(String args[]) {
        int arr1[]= {15, 20, 5, 15};
        int arr2[]= {15, 15, 15, 20, 10};
        System.out.println(countDistinct(arr1, arr2));
    }
}
