import java.util.Scanner;

public class SeriesHWD7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        int d=0;

        for (int i = 3; i <= N; i++) {
            d = (b+c)-a;
            a = b;
            b = c;
            c = d;
            
            
        }
        System.out.println("Nth element: " + d);
    }

}
