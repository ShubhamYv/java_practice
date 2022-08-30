import java.util.HashMap;
import java.util.Map;

public class _4_FrequenciesOfArrayElements {
    public static void countFreq(int arr[], int n) {
        HashMap<Integer, Integer> h= new HashMap<>();
        for(int x: arr)
            h.put(x, h.getOrDefault(x, 0)+1);
        for (Map.Entry<Integer, Integer> e: h.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }

    public static void main(String[] args) {
        int arr[]= {10, 12, 10, 15, 10, 20, 12, 12};
        int n= arr.length;
        countFreq(arr, n);
    }
}

