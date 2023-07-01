import java.util.*;

public class List5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Duck dc = new Duck();
        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            String b = sc.nextLine();
            dc.append(b);
        }
        sc.close();
        for (int i = 0; i < a; i++) {
            if (dc.extract(i)!= null) {
                System.out.println(dc.extract(i));
            }
        }
    }
}
class Duck{
    ArrayList<String> arr = new ArrayList<>(); 
    public void append(String data) {
        arr.add(data);
    }
    public String extract(int i){
        String ar[] = arr.get(i).split("-");
            if (ar[1].equals("0") && ar[2].equals("0")){
                return ar[0];
            }
        return null;
    }
}