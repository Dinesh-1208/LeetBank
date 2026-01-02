class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> c = new HashMap<>();
        for(int i : nums) {
            c.put(i,c.getOrDefault(i,0) + 1);
        }
        for(int k : c.keySet()) {
            if(c.get(k) > 1) return k;
        }
        throw null;
    }
}