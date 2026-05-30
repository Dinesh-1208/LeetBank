import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");
        for(String s : parts) {
            if((st.isEmpty() && s.equals("..")) || s.equals(".") || s.equals("")) {
                continue;
            } else if(s.equals("..")) {
                st.pop();
            } else {
                st.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str : st) {
            sb.append("/");
            sb.append(str);
        }
        String ans =  sb.toString();
        return ans.equals("")? "/" : ans;
    }
}