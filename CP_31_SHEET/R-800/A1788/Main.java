import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int cnt = 0;
            for(int i = 0;i < n;i++) {
                a[i] = sc.nextInt();
                if(a[i] == 2) cnt++;
            } 
            if(cnt % 2 == 1) {
                System.out.println(-1);
            } else if(cnt == 0) {
                System.out.println(1);
            } else {
                int ts = 0;
                for(int i = 0;i < n;i++) {
                    if(a[i] == 2) ts++;
                    if(ts == cnt/2) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}