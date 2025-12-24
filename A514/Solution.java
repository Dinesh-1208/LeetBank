package A514;

import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 1;
        long ans = 0;
        while(n > 0) {
            long t = n % 10;
            t = (n < 10 && t == 9) ? t : Math.min(t,9-t);
            ans += t*res;
            res *= 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
