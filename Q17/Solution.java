import java.util.ArrayList;
import java.util.List;
public class Solution {
    static String[] map = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    static ArrayList<String> padRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        String str = map[up.charAt(0) - '0'];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) {
            return new ArrayList<>();
        }
        return padRet("", digits);
    }
}