class Solution {
    public boolean halvesAreAlike(String s) {
         int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                if (i < s.length() / 2)
                    count++;
                else
                    count--;
            }
        }

        return count == 0;
    }
}