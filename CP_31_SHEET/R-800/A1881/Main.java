import java.util.*;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int c = 0;
            while(x.length() <= n * m) {
                if(x.contains(s)) {
                    break;
                } else {
                    x += x;
                    c++;
                }
            }
            if(x.contains(s)) {
                System.out.println(c);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}