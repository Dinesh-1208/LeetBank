package A263;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int col = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int ans = Math.abs(2 - row) + Math.abs(2 - col);
        System.out.println(ans);
    }
}