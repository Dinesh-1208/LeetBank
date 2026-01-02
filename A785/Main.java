package A785;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s) {
                case "Tetrahedron":
                    ans += 4;
                    break;
                case "Cube":
                    ans += 6;
                    break;
                case "Octahedron":
                    ans += 8;
                    break;
                case "Dodecahedron":
                    ans += 12;
                    break;
                case "Icosahedron":
                    ans += 20;
                    break;
            }
        }
        System.out.println(ans);
    }
}
