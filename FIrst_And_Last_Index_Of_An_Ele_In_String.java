import java.util.*;
public class FIrst_And_Last_Index_Of_An_Ele_In_String {
    public static int first= -1;
    public static int last= -1;
    public static void elePosn(String str, int index, char ele){
        if(index== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar= str.charAt(index);
        if(currChar== ele){
            if (first==-1){
                first= index;
            }else{
                last= index;
            }
        }
        elePosn(str, index+1, ele);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        char ele= sc.next().charAt(0);
        elePosn(str, 0, ele);
    }
}

