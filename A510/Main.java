package A510;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            if ((i % 2) != 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print("#");
                }
            } else {
                if (i % 4 == 2) {
                    for (int j = 1; j < c; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 1; j < c; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}