
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class FreqStack {
    Map<Integer, Stack<Integer>> stacks;
    HashMap<Integer,Integer> cnt;
    int maxCnt;
    public FreqStack() {
        this.stacks = new HashMap<>();
        this.cnt = new HashMap<>();
        this.maxCnt = 0;
    }
    
    public void push(int val) {
        int valCnt = cnt.getOrDefault(val,0) + 1;
        cnt.put(val,valCnt);
        if(valCnt > maxCnt) {
            maxCnt = valCnt;
            stacks.putIfAbsent(valCnt,new Stack<>());
        }
        stacks.get(valCnt).push(val);
    }
    
    public int pop() {
        int val = stacks.get(maxCnt).pop();
        cnt.put(val,cnt.get(val) - 1);
        if(stacks.get(maxCnt).isEmpty()) {
            maxCnt--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */