import java.util.*;
public class List4 {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Top 5 scores of Season 8");
        for (int i = 0; i < 5; i++) {
            String c = sc.nextLine();
            a.add(c);
        }
        System.out.println("Enter the Top 5 scores of Season 9");
        for (int i = 0; i < 5; i++) {
            String d = sc.nextLine();
            b.add(d);
        }
        sc.close();
        System.out.println("Consistant run scorers");
        a.retainAll(b);
        for (String i : a) {
            System.out.println(i);
        }
    }
}