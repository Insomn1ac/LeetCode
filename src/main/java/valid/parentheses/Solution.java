package valid.parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static boolean isValid(String s) {
        List<Character> closed = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                closed.add(')');
            } else if (s.charAt(i) == '[') {
                closed.add(']');
            } else if (s.charAt(i) == '{') {
                closed.add('}');
            } else {
                if (closed.size() == 0 || s.charAt(i) != closed.get(closed.size() - 1)) {
                    return false;
                }
                closed.remove(closed.size() - 1);
            }
        }
        return closed.size() == 0;
    }
}
