import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(String str : operations) {
            if(str.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
                ans += newTop;
            } else if(str.equals("D")) {
                int newTop = 2*st.peek();
                st.push(newTop);
                ans += newTop;
            } else if(str.equals("C")) {
                int r = st.pop();
                ans -= r;
            } else {
                st.puah(Integer.parseInt(str));
                ans += st.peek();
            }
        }
        return ans;
    }
}