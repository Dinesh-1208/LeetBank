import java.util.*;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer,Integer> hs = new HashMap<>();
            for(int i = 0;i < n;i++) {
                int x = sc.nextInt();
                hs.put(x,hs.getOrDefault(x,0)+1);
            }
            if(hs.size() > 2) {
                System.out.println("No");
            } else if(hs.size() == 1) {
                System.out.println("Yes");
            } else {
                int[] freq = new int[2];
                int i = 0;
                for(int x : hs.values()) {
                    freq[i++] = x;
                }
                if(freq[0] == freq[1] || Math.abs(freq[0] - freq[1]) == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}