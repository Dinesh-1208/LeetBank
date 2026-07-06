import java.util.*;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            int j = n - 1;
            while(i < j) {
                if((s.charAt(i) == '0' && s.charAt(j) == '1') || (s.charAt(i) == '1' && s.charAt(j) == '0')) {
                    i++;
                    j--;
                    n -= 2;
                } else {
                    break;
                }
            }
            System.out.println(n);
        }
        sc.close();
    }
}