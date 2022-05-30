import java.util.*;

public class Function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= in.next();
        printMyName("Your name is: \n" +name);

        }
    }

