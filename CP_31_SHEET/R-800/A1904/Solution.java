import java.util.*;
public class Main {
    static int[] dx = {-1, 1, -1, 1};
    static int[] dy = {-1, -1, 1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long xKing = sc.nextLong();
            long yKing = sc.nextLong();
            long xQueen = sc.nextLong();
            long yQueen = sc.nextLong();
            Set<String> kingHits = new HashSet<>();
            Set<String> queenHits = new HashSet<>();
            for (int i = 0; i < 4; i++) {
                kingHits.add((xKing + dx[i] * a) + "," + (yKing + dy[i] * b));
                kingHits.add((xKing + dx[i] * b) + "," + (yKing + dy[i] * a));
                queenHits.add((xQueen + dx[i] * a) + "," + (yQueen + dy[i] * b));
                queenHits.add((xQueen + dx[i] * b) + "," + (yQueen + dy[i] * a));
            }
            int ans = 0;
            for (String pos : kingHits) {
                if (queenHits.contains(pos)) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
