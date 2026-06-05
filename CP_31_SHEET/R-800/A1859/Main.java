import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0] == arr[n-1]) {
                System.out.println("-1");
                continue;
            }
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            for(int x : arr) {
                if(x  == arr[0]) {
                    b.add(x);
                } else {
                    c.add(x);
                }
            }
            System.out.println(b.size() + " " + c.size());

            for (int x : b) {
                System.out.print(x + " ");
            }
            System.out.println();

            for (int x : c) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}