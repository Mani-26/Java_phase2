import java.util.*;

public class Map1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new HashMap<>();
        System.out.println("Enter the number of teams:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter team " + i + " detail:");
            System.out.println("Enter Name:");
            String s = sc.nextLine();
            System.out.println("Enter the number of matches:");
            int num = sc.nextInt();
            sc.nextLine();
            m.put(s, num);
        }
        sc.close();
        List<Map.Entry<String, Integer>> sortedteam = new ArrayList<>(m.entrySet());
        Collections.sort(sortedteam, Map.Entry.comparingByValue());
        System.out.println("Team list after sorting by number of matches:");
        for (Map.Entry<String, Integer> i : sortedteam) {
            System.out.println(i.getKey() + " — " + i.getValue());
        }
    }
}