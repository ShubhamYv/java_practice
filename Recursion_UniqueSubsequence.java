import java.util.*;
import java.util.HashSet;
public class Recursion_UniqueSubsequence {
    public static void subSequence(String str, int ind, String newStr, HashSet<String> set){
        if (ind == str.length()){
            if(set.contains(newStr)) {
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currChar= str.charAt(ind);
        subSequence(str, ind+1, newStr+currChar, set);
        subSequence(str, ind+1, newStr, set);
    }

    public static void main(String[] args){
        String str= "aaa";
        HashSet<String> set= new HashSet<>();
        subSequence(str, 0, "", set);
    }
}
