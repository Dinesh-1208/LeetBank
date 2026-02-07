class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] ca = new int[n];
        int[] cb = new int[n];
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            cb[i] = c2;
            if (s.charAt(i) == 'b')
                c2++;
        }
        int c1 = 0;
        for (int i = n - 1; i >= 0; i--) {
            ca[i] = c1;
            if (s.charAt(i) == 'a')
                c1++;
        }
        int minl = n;
        for (int i = 0; i < n; i++) {
            minl = Math.min(minl, ca[i] + cb[i]);
        }
        return minl;
    }
}