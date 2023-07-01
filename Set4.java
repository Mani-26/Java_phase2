import java.util.*;
public class Set4 {
    public static void main(String[] args) {
        HashSet<String> bowl1 = new HashSet<>();
        HashSet<String> bowl2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of best bowlers in season 4");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the players");
        for (int i = 0; i < a; i++) {
            String str = sc.nextLine();
            bowl1.add(str);
        }
        System.out.println("Enter the number of bost bowlers in the season 5");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the players");
        for (int i = 0; i < b; i++) {
            String str = sc.nextLine();
            bowl2.add(str);
        }
        System.out.println("Player Set 1");
        for (String str1 : bowl1) {
            System.out.println(str1);
        }
        System.out.println("Player Set 2");
        for (String str2 : bowl2) {
            System.out.println(str2);
        }
        System.out.println("Difference");
        bowl1.removeAll(bowl2);
        for (String string : bowl1) {
            System.out.println(string);
        }
    }
}
