import java.util.*;

public class Pass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        sc.close();
        int arr[] = { a, b, c, d, e };
        Arrays.sort(arr);
        int max = arr[4];
    }

 static int digit(int input, int digit) {
        int n = 0;
        while (digit > 0) {
            n = input % 10;
            input /= 10;
            digit--;
        }
        return n;
    }
        
}