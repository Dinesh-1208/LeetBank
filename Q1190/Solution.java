import java.util.*;

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for(char c : s.toCharArray()) {
            switch (c) {
                case '(' -> {
                    st.push(curr);
                    curr = new StringBuilder();
                }
                case ')' -> {
                    curr.reverse();
                    curr = st.pop().append(curr);
                }
                default -> curr.append(c);
            }
        }
        return curr.toString();
    }
}