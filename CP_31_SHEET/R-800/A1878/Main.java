import java.util.*;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++) {
                arr[i] = sc.nextInt();
            }
            boolean found = false;
            for(int x : arr) {
                if(x == k) {
                    found = true;
                    break;
                }
            }
            if(found) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}