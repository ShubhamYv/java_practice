import java.util.*;
public class Arrays {
    public static void main(String args[]){
        int[] marks= new int[3];
        marks[0]= 98;
        marks[1]= 97;
        marks[2]= 95;
        System.out.println(marks[0]+" "+marks[1]+" "+marks[2]);

        //or we can print by using loop
        for(int i=0; i<=2; i++){
            System.out.println(marks[i]);
        }
    }
}
