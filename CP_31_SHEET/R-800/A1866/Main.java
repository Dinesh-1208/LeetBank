import java.util.*;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = Integer.MAX_VALUE;
        int n = sc.nextInt();
        for(int i = 0;i < n;i++) {
            int a = sc.nextInt();
            ans = Math.min(ans,Math.abs(a));
        }
        System.out.println(ans);
        sc.close();
    }
}