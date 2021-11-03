package print.words.vertically;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> printVertically(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> rsl = new ArrayList<>();
        int length = 0;
        String[] words = s.split("\\s");
        for (String str : words) {
            length = Math.max(length, str.length());
        }
        for (int i = 0; i < length; i++) {
            for (String str : words) {
                if (i >= str.length()) {
                    sb.append(" ");
                } else {
                    sb.append(str.charAt(i));
                }
            }
            rsl.add(sb.toString().stripTrailing());
            sb.setLength(0);
        }
        return rsl;
    }
}
