public class Robot {
    boolean move = false;
    int width;
    int height;
    int[] pos;
    int[][] dirs;
    int dir;

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        pos = new int[] { 0, 0 };
        dirs = new int[][] {
                { 0, 1 },
                { 1, 0 },
                { 0, -1 },
                { -1, 0 }
        };
        dir = 1;
    }

    public void step(int num) {
        int perimeter = 2 * (width + height - 2);
        num = num % perimeter;
        if (num == 0) {
            if (pos[0] == 0 && pos[1] == 0) {
                dir = 2;
            }
        }
        for (int i = 1; i <= num; i++) {
            int nx = pos[0] + dirs[dir][0];
            int ny = pos[1] + dirs[dir][1];
            if (nx < 0 || nx >= width || ny < 0 || ny >= height) {
                dir = (dir + 3) % 4;
                nx = pos[0] + dirs[dir][0];
                ny = pos[1] + dirs[dir][1];
            }
            pos[0] = nx;
            pos[1] = ny;
        }
    }

    public int[] getPos() {
        return pos;
    }

    public String getDir() {
        if (dir == 0) {
            return "North";
        } else if (dir == 1) {
            return "East";
        } else if (dir == 2) {
            return "South";
        } else {
            return "West";
        }
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */