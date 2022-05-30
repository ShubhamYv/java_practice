import java.util.*;
public class Recursion_ReverseA_String {
     public static void revStr(String str, int index){
         if(index==0){
             System.out.print(str.charAt(index));
             return;
         }
         System.out.print(str.charAt(index));
         revStr(str, index-1);
     }

     public static void main(String[] args){
         String str= "abcd";
         revStr(str, str.length()-1);
     }
}
