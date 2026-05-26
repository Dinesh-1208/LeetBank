
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids) {
            boolean f = false;
            while(!st.isEmpty() && a < 0 && st.peek() > 0) {
                if(Math.abs(a) > st.peek()) {
                    st.pop();
                } else if(Math.abs(a) == st.peek()) {
                    f  = true;
                    st.pop();
                    break;
                } else {
                    f = true;
                    break;
                }
            }
            if(!f) {
                st.push(a);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = st.size() - 1;i >= 0;i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}