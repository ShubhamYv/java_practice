public class Recursion_MoveAll_x_ToEndOfThe_String {
    public static void moveAllXToTheEnd(String str, int ind, int count, String newStr){
        if (ind == str.length()){
            for(int i=0; i<count; i++){
                newStr+= "x";
            }
            System.out.println(newStr);
            return;
        }
        
        char curChar= str.charAt(ind);
        if(curChar == 'x'){
            count++;
            moveAllXToTheEnd(str, ind+1, count, newStr);
        }else{
            newStr+= curChar;
            moveAllXToTheEnd(str, ind+1, count, newStr);
        }
    }

    public static void main(String[] args){
        String str= "axbcxxd";
        moveAllXToTheEnd(str, 0, 0, "");  //at starting newStr will be empty same for count and index
    }
}
