class Solution {
    List<String> ans = new ArrayList<>();
    Set<String> seen = new HashSet<>();
    int minRem = Integer.MAX_VALUE;
    public List<String> removeInvalidParentheses(String s) {
        backtrack(s,0,0,new StringBuilder());
        return ans;
    }
    void backtrack(String s,int index,int depth,StringBuilder curr) {
        if(index == s.length()) {
            if(depth == 0) {
                int len = s.length() - curr.length();
                if(len < minRem) {
                    minRem = len;
                    ans.clear();
                    seen.clear();
                    seen.add(curr.toString());
                    ans.add(curr.toString());
                } else {
                    if(minRem == len) {
                        if(!seen.contains(curr.toString())) {
                            ans.add(curr.toString());
                            seen.add(curr.toString());
                        }
                    }
                }
            }
            return;
        }
        char ch = s.charAt(index);
        if(ch != '(' && ch != ')') {
            curr.append(ch);
            backtrack(s,index+1,depth,curr);
            curr.deleteCharAt(curr.length() - 1);
        } else {
            backtrack(s,index+1,depth,curr);
            if(ch == '(') {
                curr.append(ch);
                backtrack(s,index+1,depth+1,curr);
                curr.deleteCharAt(curr.length() - 1);
            } else {
                if(depth > 0) {
                    curr.append(ch);
                    backtrack(s,index+1,depth - 1,curr);
                    curr.deleteCharAt(curr.length() - 1);
                }
            }
        }
    }
}