package Q2515;

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans = words.length;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - startIndex);
                ans = Math.min(ans, Math.min(n - dist, dist));
            }
        }
        return (ans == n) ? -1 : ans;
    }
}