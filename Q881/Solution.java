class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        while(l < r) {
            if(people[r] + people[l] <= limit) {
                l++;
            }
            count++;
            r--;
        }
        return (l == r)? count+1 : count;
    }
}