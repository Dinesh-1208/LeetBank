import java.util.*;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];

            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }

            int odd = 0;

            for (int i = 0; i < 26; i++) {
                if ((freq[i] & 1) == 1) {
                    odd++;
                }
            }

            if (odd > k + 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}