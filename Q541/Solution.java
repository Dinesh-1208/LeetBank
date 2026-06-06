class Solution {
    public String reverseStr(String s, int k) {

        int c = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < s.length()) {

            if(c % 2 == 0) {

                for(int j = i + k - 1; j >= i; j--) {
                    if(j < s.length()) {
                        sb.append(s.charAt(j));
                    }
                }

                i += k;
                c++;

            } else {

                for(int j = i; j <= i + k - 1; j++) {
                    if(j < s.length()) {
                        sb.append(s.charAt(j));
                    }
                }

                i += k;
                c++;
            }
        }

        return sb.toString();
    }
}