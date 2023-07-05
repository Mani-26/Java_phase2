import java.util.*;

public class LinkedListHWD5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1[] = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            list.add(str1[i]);
        }
        int n = sc.nextInt();
        sc.close();
        System.out.println("LinkedList : " + list);
        if (n < str1.length) {
            System.out.print("Element at index " + n + ": " + list.get(n));
        } else {
            System.out.println("Invalid index!");
        }

    }
}
