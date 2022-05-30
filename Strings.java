import java.util.*;
public class Strings {
    public static void main(String args[]){
        //String declaration

//        //Input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the book name: ");
//        String bookName= sc.next(); //sc.nex--> for only single word
//        System.out.println("Your book name is: "+ bookName);
//
//        System.out.println("Enter the Description: ");
//        String bookDescription= sc.nextLine(); //sc.nextLine--> for whole line or paragraph
//        System.out.println("book description is: "+bookDescription);
//
//
//
//        //CONCATENATION
//        String firstName= "Shubham";
//        String lastName= "Yadav";
//        String fullName= firstName+ " " +lastName;
//        System.out.println("Full name is: "+fullName);
//
//
//        //LENGTH FUNCTION
//        System.out.println("Length of Full name is: "+fullName.length());
//
//        //charAt
//        for(int i=0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }

//        //COMPARE  (str1.compareTo(str2)) return 0--> if equal, +ve value--> if str1 is greater, -ve val-->if str2 is greater
//        String name1= "Shubham";
//        String name2= "Yadav";
//        if(name1.compareTo(name2)==0){
//            System.out.println("String is equal...");
//        }else{
//            System.out.println("Not equal...");
//        }


        //SUBSTRING  --> varName.substring(start Index, end Index)
        String name= "My name is Shubham Yadav";
        String words= name.substring(7, name.length());
        System.out.println("Slicing words are: " +words);


        //NOTE: strings are immutable-->if you want to change anythng you have to make a new string.

    }
}
