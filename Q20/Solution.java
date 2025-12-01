/* 
   Problem: 20
   Source: LeetCode
   Language: Java
*/
package Q20;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                list.add(c);
            } else {
                if (list.isEmpty()) {
                    return false;
                }
                char last = list.remove(list.size() - 1);
                if (c == ')' && last != '(')
                    return false;
                if (c == '}' && last != '{')
                    return false;
                if (c == ']' && last != '[')
                    return false;
            }
        }
        return list.isEmpty();
    }
}