class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        int ans = 0;
        boolean[] vis = new boolean[1000];
        for(int x = 0;x < n;x++) {
            if(digits[x] == 0) {
                continue;
            }
            for(int y = 0;y < n;y++) {
                if(y == x) continue;
                for(int z = 0; z < n;z++) {
                    if(z == x || z == y || digits[z] % 2 != 0) {
                        continue;
                    }
                    int num =  digits[x] * 100 + digits[y] * 10 + digits[z];
                    if(!vis[num]) {
                        vis[num] = true;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}