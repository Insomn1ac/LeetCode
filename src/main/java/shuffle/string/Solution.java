package shuffle.string;

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] rsl = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            rsl[indices[i]] = s.charAt(i);
        }
        return String.valueOf(rsl);
    }
}
