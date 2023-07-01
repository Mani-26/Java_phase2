import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Revenue> rlist = new LinkedHashSet<Revenue>();
        String ch;
        do {
            System.out.println("Enter revenue category");
            String ctgy = sc.nextLine();
            System.out.println("Enter revenue amount");
            int amt = sc.nextInt();
            rlist.add(new Revenue(ctgy, amt));
            System.out.println("Do you want to continue(yes/no)");
            ch = sc.next();
            sc.nextLine();
            sc.close();
        } while (ch.equals("yes"));
        int sum = 0;
        System.out.println("Top spending categories");
        System.out.println("Category\tAmount");
        for (Revenue r : rlist) {
            System.out.println(r.cat + "\t" + r.amt);
            sum += (r.amt);
        }
        System.out.println("Total amount earned: " + sum);
    }
}
class Revenue {
    String cat;
    int amt;
    Revenue(String cat, int amt) {
        this.cat = cat;
        this.amt = amt;
    }
}