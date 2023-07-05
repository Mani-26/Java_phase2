import java.util.*;

public class Mapeg {
    public static void main(String[] args) {
        Map<String, Integer> mp = new TreeMap<>();
        mp.put("Mani", 26);
        mp.put("Ravi", 30);
        mp.put("Sibi", 19);
        for (Map.Entry<String, Integer> i : mp.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
