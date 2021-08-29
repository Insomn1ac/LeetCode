package longest.common.prefix;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String start = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(start)) {
                start = start.substring(0, start.length() - 1);
            }
        }
        return start;
    }
}
