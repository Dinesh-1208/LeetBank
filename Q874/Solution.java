package Q874;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int dir = 0;
        int maxim = 0;
        int[][] dirs = {
                { 0, 1 },
                { 1, 0 },
                { 0, -1 },
                { -1, 0 }
        };
        Set<String> set = new HashSet<>();
        for (int[] ob : obstacles) {
            set.add(ob[0] + "," + ob[1]);
        }
        for (int command : commands) {
            if (command == -1) {
                dir = (dir + 1) % 4;
            } else if (command == -2) {
                dir = (dir + 3) % 4;
            } else {
                for (int i = 0; i < command; i++) {
                    int nx = x + dirs[dir][0];
                    int ny = y + dirs[dir][1];
                    if (set.contains(nx + "," + ny)) {
                        break;
                    }
                    x = nx;
                    y = ny;
                    maxim = Math.max(maxim, x * x + y * y);
                }
            }
        }
        return maxim;
    }
}
