/* 
   Problem: 3606
   Source: LeetCode
   Language: Java
*/

class Solution {
    public static boolean isValidCode(String s) {
        if (s.equals("") || s.length() == 0)
            return false;
        for (char c : s.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                return false;
            }
        }
        return true;
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("electronics", new ArrayList<>());
        map.put("grocery", new ArrayList<>());
        map.put("pharmacy", new ArrayList<>());
        map.put("restaurant", new ArrayList<>());

        for (int i = 0; i < code.length; i++) {
            if (!isActive[i])
                continue;
            if (!map.containsKey(businessLine[i]))
                continue;
            if (!isValidCode(code[i]))
                continue;

            map.get(businessLine[i]).add(code[i]);
        }

        List<String> ans = new ArrayList<>();
        String[] order = { "electronics", "grocery", "pharmacy", "restaurant" };

        for (String b : order) {
            Collections.sort(map.get(b));
            ans.addAll(map.get(b));
        }
        return ans;
    }
}
