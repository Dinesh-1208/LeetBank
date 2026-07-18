import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int middle = n - a - b;
            if (n == 1) {
                System.out.println("Yes");
            } else if (middle > 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}