package find.the.difference;

import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.charAt(0);
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        int count = 0;
        for (int i = 0; i < sArray.length; i++) {
            if (tArray[i] != sArray[i]) {
                count = i;
                break;
            } else {
                count = tArray.length - 1;
            }
        }
        return tArray[count];
    }
}
