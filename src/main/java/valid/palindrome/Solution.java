package valid.palindrome;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Solution {
    public static boolean isPalindrome(String s) {
        List<Character> list = new LinkedList<>();
        boolean rsl = true;
        for (char c : s.toLowerCase().replaceAll("[^0-9A-Za-z]+", "").toCharArray()) {
            list.add(c);
        }
            ListIterator<Character> liter = list.listIterator();
            ListIterator<Character> revLiter = list.listIterator(list.size());
            while (liter.hasNext() && revLiter.hasPrevious()) {
                if (liter.next() != revLiter.previous()) {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }
}
