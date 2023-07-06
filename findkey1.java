public class findkey1 {
    public static void main(String[] args) {
        // input 1, input 2, input 3 will be given by the mettl
        int input1=3521, input2=2452,input3=1352;
        int a[] = {digit(input1, 4),digit(input1, 3),digit(input1, 2),digit(input1, 1) };
        int b[] = {digit(input2, 4),digit(input2, 3),digit(input2, 2),digit(input2, 1) };
        int c[] = {digit(input3, 4),digit(input3, 3),digit(input3, 2),digit(input3, 1) };
        int larth =  Math.max(a[0], Math.max(b[0],c[0]));
        int smath =  Math.min(a[0], Math.min(b[0],c[0]));
        int th=larth-smath;
        int larh =  Math.max(a[1], Math.max(b[1],c[1]));
        int smah =  Math.min(a[1], Math.min(b[1],c[1]));
        int h=larh-smah;
        int lart =  Math.max(a[2], Math.max(b[2],c[2]));
        int smat =  Math.min(a[2], Math.min(b[2],c[2]));
        int t=lart-smat;
        int laru =  Math.max(a[3], Math.max(b[3],c[3]));
        int smau =  Math.min(a[3], Math.min(b[3],c[3]));
        int u=laru-smau;
        System.out.println(th*1000 + h*100 +t*10+u);
    }

    static int digit(int input, int digit) {
        int n = 0;
        while (digit > 0) {
            n = input % 10;
            input /= 10;
            digit--;
        }
        return n;
    }
}
