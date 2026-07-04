import java.util.*;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();
            if(y1 > y2) {
                System.out.println("-1");
                continue;
            }
            long diag = y2 - y1;
            if(diag + x1 < x2) {
                System.out.println("-1");
                continue;
            }
            long left = diag + x1 - x2;
            System.out.println(diag + left);
        }
        sc.close();
    }
}