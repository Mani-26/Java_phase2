import java.util.*;

class ListHWD5 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players selected:");
        int n = sc.nextInt();
        String str3;
        sc.nextLine();
        System.out.println("Enter the names of the players:");
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            list.add(str);
        }
        do {
            System.out.println("Menu:");
            System.out.println("1. Insert Players");
            System.out.println("2. Delete Players");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                System.out.println("Enter the player to insert:");
                String str1 = sc.nextLine();
                list.add(str1);
                System.out.println("Player details after modification:");
                Iterator<String> b = list.iterator();
                while (b.hasNext()) {
                    System.out.println(b.next());
                }
            } else {
                System.out.println("Enter the player to delete:");
                String str2 = sc.nextLine();
                list.remove(str2);
                System.out.println("Player details after modification:");
                Iterator<String> c = list.iterator();
                while (c.hasNext()) {
                    System.out.println(c.next());
                }
            }
            System.out.println("Do you want to continue (Yes/No)?");
            str3 = sc.next();
        } while (str3.equals("yes"));
        sc.close();
    }
}