package length.of.last.word;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] rsl = s.trim().split(" ");
        return rsl[rsl.length - 1].length();
    }
}
