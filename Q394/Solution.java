import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> ns = new Stack<>();

        int k = 0;
        StringBuilder curr = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if(c == '[') {
                st.push(curr.toString());
                ns.push(k);
                curr = new StringBuilder();
                k = 0;
            } else if(c == ']') {
                String prev = st.pop();
                int count = ns.pop();
                StringBuilder temp = new StringBuilder(prev);
                for(int i = 0;i < count;i++) {
                    temp.append(curr);
                }
                curr = temp;
            } else {
                curr.append(c);
            }
        }
        return curr.toString();
    }
}