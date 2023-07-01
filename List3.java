import java.util.*;
public class List3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            arr.add(b);
        }
        sc.close();
        for (int i = 0; i < a; i++) {
            if (i % 2 != 0) {
                c += arr.get(i);
            }
        }
        System.out.println(c);
    }
}
