class Solution {
    public boolean canAliceWin(int n) {
        int lost = solve(n,10,0);
        return !(lost == 0);
    }
    public int solve(int n,int qremoved,int turn) {
        if(n < qremoved) {
            return turn;
        } else {
            return solve(n - qremoved,qremoved - 1,turn ^ 1);
        }
    }
}