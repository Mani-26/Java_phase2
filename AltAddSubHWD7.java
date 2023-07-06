import java.util.Scanner;

public class AltAddSubHWD7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int opt = sc.nextInt();
        int result=N;
        sc.close();
        if (opt == 2) {
            for (int i = N - 1; i >= 1; i--) {
                if (i % 2 == 0) {
                    result -= i;
                } else {
                    result += i;
                }
            }
        } else if (opt == 1) {
            for (int i = N - 1; i >= 1; i--) {
                if (i % 2 == 0) {
                    result += i;
                } else {
                    result -= i;
                }
            }
        }

        System.out.println("Result: " + result);
    }

}