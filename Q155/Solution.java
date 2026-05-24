
import java.util.Stack;

class MinStack {

    Stack<Long> s;
    long m;
    public MinStack() {
        s = new Stack<>();

    }
    
    public void push(int val) {
        if(s.isEmpty()) {
            s.push(0L);
            m = val;
        } else {
            s.push(val - m);
            if(val < m) m = val;
        }
    }
    
    public void pop() {
        long top = s.pop();
        if(top < 0) {
            m = m - top;
        }
    }
    
    public int top() {
        long top = s.peek();
        if(top >= 0) {
            return (int)(top + m);
        }
        return (int)m;
    }
    
    public int getMin() {
        return (int)m;
    }
}
