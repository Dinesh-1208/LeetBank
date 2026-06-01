import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for(int i = 0;i < n;i++) {
                b[i] = sc.nextInt();
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0;i < n - 1;i++) {
                ans.add(b[i]);
                if(b[i] > b[i+1]) ans.add(1);
            }
            ans.add(b[n - 1]);
            for(int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}