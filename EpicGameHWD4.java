import java.util.*;

public class EpicGameHWD4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        System.out.println(heap(a, b, n));
    }

    static int heap(int a, int b, int c) {
        int output = 0;
        for (int i = 1; i > 0; i++) {
            if (i % 2 != 0) {
                int gcd = GCD(a, c);
                if (gcd <= c) {
                    c = c - gcd;
                    if (c == 0) {
                        output = 0;
                        break;
                    }
                } else {
                    output = 1;
                    break;
                }
            } else {
                int gcd = GCD(b, c);
                if (gcd <= c) {
                    c = c - gcd;
                    if (c == 0) {
                        output = 1;
                        break;
                    }
                } else {
                    output = 0;
                    break;
                }
            }
        }
        return output;
    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            int s = a % b;
            return (GCD(b, s));

        }
    }
}
