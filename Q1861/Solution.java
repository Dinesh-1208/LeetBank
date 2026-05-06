class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] rotatedBox = new char[n][m];
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                rotatedBox[i][j] = boxGrid[m - 1 - j][i];
            }
        }
        for(int j = 0;j < m;j++) {
            int lastEmpty = n - 1;
            for(int i = n - 1;i >= 0;i--) {
                if(rotatedBox[i][j] == '#') {
                    rotatedBox[i][j] = '.';
                    rotatedBox[lastEmpty][j] = '#';
                    lastEmpty--;
                }
                if(rotatedBox[i][j] == '*') {
                    lastEmpty = i - 1;
                }
            }
        }
        return rotatedBox;
    }
}