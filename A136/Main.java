package A136;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            p[num - 1] = i + 1;
        }
        for (int j : p) {
            System.out.print(j + " ");
        }
    }
}
