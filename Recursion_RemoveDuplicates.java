public class Recursion_RemoveDuplicates {
    public static boolean[] map= new boolean[26];
    public static void remDuplicates(String str, int ind, String newStr){
        if (ind== str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar= str.charAt(ind);
        if(map[currChar-'a']== true){
            remDuplicates(str, ind+1, newStr);
        }else{
            newStr += currChar;
            map[currChar-'a']= true;
            remDuplicates(str, ind+1, newStr);
        }
    }
    public static void main(String[] args){
        String str = "abbccdda";
        remDuplicates(str, 0, "");
    }
}
