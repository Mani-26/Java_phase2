import java.util.Scanner;

public class Midni8Oil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the program in lines: ");
        int n = scanner.nextInt();

        System.out.print("Enter the productivity reduction coefficient: ");
        int k = scanner.nextInt();
        scanner.close();
        int v = 1;
        int linesWritten = 0;

        while (linesWritten < n) {
            linesWritten += v;
            v /= k;
        }

        System.out.println("The minimum value of v is: " + v);
    }
}
