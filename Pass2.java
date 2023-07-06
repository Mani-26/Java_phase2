import java.util.*;

public class Pass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        sc.close();
        System.out.print(password(a, b, c, d, e));
    }

    public static int password(int a, int b, int c, int d, int e) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        ArrayList<Integer> m = new ArrayList<Integer>();
        int arr[] = { a, b, c, d, e };
        for (int i = 0; i < 5; i++) {
            int p = arr[i];
            int h[] = new int[10];
            while (p != 0) {
                int index = p % 10;
                h[index]++;
                p = p / 10;
            }
            Arrays.sort(h);
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if ((h[j] == h[9]) || (h[j] == 0)) {
                    count++;
                }
            }
            if (count == 10) {
                n.add(arr[i]);
            } else {
                m.add(arr[i]);
            }
        }
        return Collections.max(n) - Collections.min(n);
    }
}