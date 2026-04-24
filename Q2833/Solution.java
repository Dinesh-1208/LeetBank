class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int count_ = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L')
                countL++;
            if (c == 'R')
                countR++;
            if (c == '_')
                count_++;
        }
        return Math.abs(countL - countR) + count_;
    }
}