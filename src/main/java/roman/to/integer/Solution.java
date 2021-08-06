package roman.to.integer;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int rsl = 0;
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        for (int i = 0; i < s.length() - 1; i++) {
            if (hashMap.get(s.charAt(i)) >= hashMap.get(s.charAt(i + 1))) {
                rsl += hashMap.get(s.charAt(i));
            } else {
                rsl -= hashMap.get(s.charAt(i));
            }
        }
        rsl += hashMap.get(s.charAt(s.length() - 1));
        return rsl;
    }
}
