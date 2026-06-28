import java.util.*;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int gap = Integer.MAX_VALUE;
            boolean sorted = true;
            int a = sc.nextInt();
            for(int i = 1; i < n; i++) {
                int b = sc.nextInt();
                if(a > b)
                    sorted = false;
                gap = Math.min(gap, b - a);
                a = b;
            }
            if(!sorted)
                System.out.println(0);
            else
                System.out.println(gap / 2 + 1);
        }
        sc.close();
    }
}