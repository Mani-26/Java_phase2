import java.util.*;
public class SetHWD6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Set<String> a=new HashSet<String>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s1=sc.nextLine();
            a.add(s1);
        }
        sc.close();
        System.out.println(a.size());
    }
}