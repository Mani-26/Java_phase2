import java.util.*;
public class List2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the teams in the ranking table.");
        for (int i = 0; i < 5; i++) {
            str = sc.nextLine();
            arr.add(str);
        }
        System.out.println("Enter the rank to be searched");
        int c = sc.nextInt();
        sc.close();
        System.out.println(arr.get(c-1));
    }
}
