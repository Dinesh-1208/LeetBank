class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> x : knowledge) {
            map.put(x.get(0),x.get(1));
        }
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(ch == '(') {
                StringBuilder curr = new StringBuilder();
                i++;
                while(s.charAt(i) != ')') {
                    curr.append(s.charAt(i));
                    i++;
                }
                ans.append(map.getOrDefault(curr.toString(),"?"));
                i++;
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}