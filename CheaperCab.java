import java.util.*;
public class CheaperCab {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int x= sc.nextInt();
            int y= sc.nextInt();
            if(x<y){
                System.out.println("FIRST");
            }else if(x>y){
                System.out.println("SECOND");
            }else {
                System.out.println("ANY");
            }
           t--;
        }
    }
}
