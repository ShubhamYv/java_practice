import java.util.HashMap;
import java.util.Map;

public class _2_HashMap {
    public static void main(String args[]) {
        HashMap<String, Integer> m= new HashMap<String, Integer>();
        m.put("gfg", 10);
        m.put("course", 15);
        m.put("ide", 20);
        System.out.println(m);
        System.out.println(m.size());
        for (Map.Entry<String, Integer> e: m.entrySet())
            System.out.println(e.getKey()+ " "+ e.getValue());

        if (m.containsKey("ide"))
            System.out.println("YES");
        else
            System.out.println("NO");
        System.out.println("Size before removing ele: "+m.size());
        System.out.println("******************************************************");
        m.remove("ide");
        System.out.println("Size after removing an ele: "+m.size());
        System.out.println(m.get("gfg"));
        System.out.println(m.get("practice"));
    }
}
