
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int evalRPN(String[] tokens) {
        List<String> list = new ArrayList<>(Arrays.asList(tokens));
        return solve(list);
    }

    public int solve(List<String> list) {
        String op = list.remove(list.size() - 1);
        if(!"+-/*".contains(op)) {
            return Integer.parseInt(op);
        }
        int num1 = solve(list);
        int num2 = solve(list);
        switch (op) {
            case "+" -> {
                return num2 + num1;
            }
            case "-" -> {
                return num2 - num1;
            }
            case "*" -> {
                return num2 * num1;
            }
            default -> {
            }
        }
        return num2/num1;
    }
}