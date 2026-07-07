import java.util.*;

public class Main {

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            boolean ok = false;

            for (int i = 0; i < n && !ok; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(arr[i], arr[j]) <= 2) {
                        ok = true;
                        break;
                    }
                }
            }

            System.out.println(ok ? "Yes" : "No");
        }

        sc.close();
    }
}