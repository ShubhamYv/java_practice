public class Recursion_KeypadCombination {
    public static String[] keypad= {".", "abc", "def", "ghi", "jkl"," mno","pqrs", "tu", "vwx", "yz"};
    public static void printCombination(String str, int ind, String combination){
        if (ind== str.length()){
            System.out.print(combination+" ");
            return;
        }
        char currChar= str.charAt(ind);
        String mapping= keypad[currChar-'0'];
        for (int i = 0; i< mapping.length(); i++){
            printCombination(str, ind+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){
        String str= "234";
        printCombination(str, 0, "");
    }
}
