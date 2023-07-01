import java.util.Scanner;
public class AverageCalculationHW {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a[] = new float[5];
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextFloat();
            sum = sum + a[i];
        }
        sc.close();
        float avg = sum / 5;
        System.out.printf("%.2f", avg);
    }
}