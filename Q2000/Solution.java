package Q2000;

class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        reverse(sb, index, word);
        for (int i = index + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    private void reverse(StringBuilder sb, int index, String word) {
        while (index >= 0) {
            sb.append(word.charAt(index));
            index--;
        }
    }
}