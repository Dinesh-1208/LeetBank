import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int xr = 0;
            for (int i = 0; i < n; i++) {
                xr ^= sc.nextInt();
            }

            if (n % 2 == 1) {
                System.out.println(xr);
            } else {
                if (xr == 0)
                    System.out.println(0);
                else
                    System.out.println(-1);
            }
        }
    }
}