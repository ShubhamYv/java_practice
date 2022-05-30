import java.util.*;
public class MonthlyBudget {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int month= 30;
            int expand= x-(30*y);
            if(expand>=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
