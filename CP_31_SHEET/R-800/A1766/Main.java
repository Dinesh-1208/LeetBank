import java.util.*;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int first = n;
            int c = 0;

            while (n != 0) {
                c++;
                n /= 10;
            }

            while (first >= 10) {
                first /= 10;
            }

            System.out.println(first + (c - 1) * 9);
        }

        sc.close();
    }
}