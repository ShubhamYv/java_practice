import java.util.*;
public class COUNTING_PRETTY_NUMBERS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int count = 0;
            for (int i = x; i <= y; i++) {
                int c = i % 10;
                if (c == 2 || c == 3 || c == 9) {
                    count = count + 1;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
