import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            while (i < j && !vowels.contains(sb.charAt(i))) {
                i++;
            }
            while (i < j && !vowels.contains(sb.charAt(j))) {
                j--;
            }
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}