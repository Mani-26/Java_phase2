import java.util.Scanner;
public class ProfitCalculationHWD2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sp = x * a;
        int cp = ((b * x) + 100);
        System.out.print("The profit obtained is Rs." + (sp - cp));
    }
}