package A1901;

import java.util.*;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++) {
                a[i] = sc.nextInt();
            }
            int maxi = a[0];
            for(int i = 1;i < n;i++) {
                maxi = Math.max(a[i] - a[i-1],maxi);
            }
            maxi = Math.max(maxi,2*(x - a[n-1]));
            System.out.println(maxi);
        }
        sc.close();
    }
}