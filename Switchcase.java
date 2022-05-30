import java.util.*;
public class Switchcase {
    public static void main(String args[]) {
        System.out.println("Enter a button: ");
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hii");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Invalid Button");
                break;
        }
    }

}
