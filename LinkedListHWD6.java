import java.util.*;

public class LikedListHWD6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> a = new LinkedList<Integer>();
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            if (n % 2 == 0) {
                a.add(n);
            }
        }
        System.out.print("LinkedList: ");
        System.out.println(a);
        int b = sc.nextInt();
        a.add(b);
        System.out.print("New LinkedList: ");
        System.out.println(a);
    }
}