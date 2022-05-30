import java.util.*;
public class MinimumCarRequired {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            int res;
            if (n%4 == 0) {
                res = Math.floorDiv(n, 4);
            } else {
                res = (Math.floorDiv(n, 4)) +1;
            }
            System.out.println(res);
            t--;
        }
    }
}
