import java.util.*;
public class Topic_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shubham");
        System.out.println(sb);
        
        //INSERT
        sb.insert(3,"ok");
        System.out.println(sb);

        //DELETE
        sb.delete(3,5);
        System.out.println(sb);

        //append
        sb.append(" Yadav");
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}
