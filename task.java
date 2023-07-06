import java.util.*;
public class task {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        int max=a[0], min=a[4];
        int b[] = {max/100, (max%100)/10,8}
    }
}
