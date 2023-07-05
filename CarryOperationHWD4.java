import java.util.*;

class CarryOperationHWD4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        int count = count_carry(a, b);
        if (count == 0)
            System.out.println("0\n");
        else if (count == 1)
            System.out.println("1\n");
        else
            System.out.println(count);
    }

    static int count_carry(String a, String b) {
        int carry = 0;
        int count = 0;
        int len_a = a.length(), len_b = b.length();
        while (len_a != 0 || len_b != 0) {
            int x = 0, y = 0;
            if (len_a > 0) {
                x = a.charAt(len_a - 1) - '0';
                len_a--;
            }
            if (len_b > 0) {
                y = b.charAt(len_b - 1) - '0';
                len_b--;
            }
            int sum = x + y + carry;
            if (sum >= 10) {
                carry = 1;
                count++;
            } else
                carry = 0;
        }
        return count;
    }
}