import java.util.*;

public class Set2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> player = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            player.add(sc.nextLine());
        sc.close();
        System.out.print(player.size());
    }
}