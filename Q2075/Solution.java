package Q2075;

class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols = encodedText.length() / rows;
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < cols; c++) {
            int r = 0;
            int j = c;
            while (r < rows && j < cols) {
                int index = r * cols + j;
                sb.append(encodedText.charAt(index));
                j++;
                r++;
            }
        }
        int end = sb.length() - 1;
        while (end >= 0 && sb.charAt(end) == ' ') {
            end--;
        }
        return sb.substring(0, end + 1);
    }
}
