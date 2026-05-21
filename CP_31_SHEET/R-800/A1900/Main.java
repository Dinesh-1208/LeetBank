import java.util.*;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean found = false;
            int ans = 0;
            
            int i = 0;
            while(i < n) {
                if(s.charAt(i) == '#') {
                    i++;
                    continue;
                }
                int j = i;
                while(j < n && s.charAt(j) == '.') {
                    j++;
                }
                int len = j - i;
                if(len >= 3) {
                    found = true;
                } else {
                    ans += len;
                }
                i = j;
            }
            System.out.println(found ? 2 : ans);
        }
        sc.close();
    }
}
