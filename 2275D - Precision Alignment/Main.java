import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[][] arr = new long[n][3];
            long min = Long.MAX_VALUE;

            for(int i = 0;i < n;i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
                arr[i][2] = sc.nextLong();

                long sum = arr[i][0] + arr[i][1] + arr[i][2];
                min = Math.min(min,sum);
            }
            long low = min;
            long high = min + k;
            while(low < high) {
                long mid = low + (high - low + 1) / 2;
                long needed = 0;
                boolean possible = true;
                for(int i = 0;i < n;i++) {
                    long a = arr[i][0];
                    long b = arr[i][1];
                    long c = arr[i][2];

                    long sum = a + b + c;
                    if(sum >= mid) {
                        continue;
                    }
                    if(a == b && b == c) {
                        possible = false;
                        break;
                    }
                    long increase = mid - sum;
                    long cost;
                    if(a > b || b > c) {
                        cost = increase;
                    } else {
                        long x = b - a + 1;
                        long y = c - b + 1;
                        long d = Math.min(x, y);
                        cost = 2 * d + increase;
                    }
                    needed += cost;
                    if(needed > k) {
                        possible = false;
                        break;
                    }
                }
                if(possible) {
                    low = mid;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(low);
        }
    }
}