class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() == 0 || s.equals("")) {
            return "";
        }
        int depth = 0;
        StringBuilder curr = new StringBuilder();
        for(int i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                if(depth != 0) {
                    curr.append(s.charAt(i));
                }
                depth++;
            } else {
                if(depth != 1) {
                    curr.append(s.charAt(i));
                }
                depth--;
            }
        }
        return curr.toString();
    }
}