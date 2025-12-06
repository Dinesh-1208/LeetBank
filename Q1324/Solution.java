/* 
   Problem: 1324
   Source: LeetCode
   Language: Java
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> printVertically(String s) {
        HashMap<Integer, List<Character>> mp = new HashMap<>();
        int res = 0;
        int colCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                res = 0;
                colCount++;
                continue;
            }
            mp.putIfAbsent(res, new ArrayList<>());
            List<Character> col = mp.get(res);
            while (col.size() < colCount) {
                col.add(' ');
            }
            col.add(c);
            res++;
        }
        List<String> ans = new ArrayList<>();
        int maxCol = mp.size();

        for (int i = 0; i < maxCol; i++) {
            List<Character> col = mp.get(i);
            StringBuilder sb = new StringBuilder();
            for (char ch : col)
                sb.append(ch);
            int end = sb.length() - 1;
            while (end >= 0 && sb.charAt(end) == ' ') {
                end--;
            }
            ans.add(sb.substring(0, end + 1));
        }
        return ans;
    }
}
