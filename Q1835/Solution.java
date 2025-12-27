package Q1835;

class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int x1 = 0;
        int x2 = 0;
        for (int a : arr1)
            x1 ^= a;
        for (int b : arr2)
            x2 ^= b;
        return x1 & x2;
    }
}
