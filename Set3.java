import java.util.*;

public class Set3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> s = new TreeSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++)
            s.add(sc.nextLine());
        sc.close();
        for (String i : s)
            System.out.println(i);
    }
}