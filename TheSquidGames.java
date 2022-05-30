import java.util.*;
public class TheSquidGames {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t>0){
            int n= in.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i]= in.nextInt();
            }
            int min= 1000;
            int sum=0;
            for(int i=0; i<n; i++){
                if(arr[i]< min){
                    min= arr[i];
                }
                sum= sum+arr[i];
            }
            int res= sum- min;
            System.out.println(res);
            t--;
        }
    }
}
