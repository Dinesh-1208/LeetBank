import java.util.HashSet;
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int c = 0;
        for(int i = 0;i < n;i++) {
            setA.add(A[i]);
            if(setB.contains(A[i])) c++;
            setB.add(B[i]);
            if(setA.contains(B[i])) c++;
            ans[i] = c;
        }
        return ans;
    }
}