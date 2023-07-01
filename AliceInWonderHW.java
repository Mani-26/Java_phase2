import java.util.Scanner;

public class AliceInWonderHW {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n >= 10) && (n <= 99)) {
            System.out.print("Alice must go in path-" + (n % 10 + n / 10));
        }
    }
}