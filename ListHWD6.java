import java.util.*;
public class ListHWD6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<String>();
        ArrayList<String> b=new ArrayList<String>();
        System.out.println("Enter the Size");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the top "+n+" scorers of IPL Season 8");
        for(int i=0;i<n;i++){
            String str1=sc.nextLine();
            a.add(str1);
        }
        System.out.println("Enter the top "+n+" scorers of IPL Season 9");
        for(int i=0;i<n;i++){
            String str2=sc.nextLine();
            b.add(str2);
        }
        System.out.println("Consistent run scorers");
        a.retainAll(b);
        for(String str3:a){
            System.out.println(str3);
        }        
    }
}