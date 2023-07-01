import java.util.*;
public class List1 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float  b = 0;
        for (int i = 0; i < a; i++) {
            arr.add(sc.nextFloat());
        }
        sc.close();
        for (int i = 0; i < a; i++) {
            b += arr.get(i);
        }
        System.out.println((int)b);
        System.out.printf("%.1f",(b/a));
    }
}
