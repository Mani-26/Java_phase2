import java.util.Scanner;

class SeriesHWD5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 4;
		int b = 1;
		sc.close();
		while (b <= n) {
			System.out.print(a + " ");
			a += (b * b);
			b++;
		}
	}
}
