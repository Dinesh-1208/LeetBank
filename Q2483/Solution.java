package Q2483;

class Solution {
    public int bestClosingTime(String customers) {
        int m = customers.length();
        int pn = 0;
        for (int i = 0; i < m; i++) {
            if (customers.charAt(i) == 'Y') {
                pn++;
            }
        }
        int closeTime = 0;
        int minPen = pn;
        for (int j = 0; j < m; j++) {
            char ch = customers.charAt(j);
            if (ch == 'Y') {
                pn--;
            } else {
                pn++;
            }
            if (pn < minPen) {
                minPen = pn;
                closeTime = j + 1;
            }
        }
        return closeTime;
    }
}