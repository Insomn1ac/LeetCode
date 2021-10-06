package contains.duplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> rsl = new HashSet<>();
        for (int n : nums) {
            rsl.add(n);
        }
        return rsl.size() != nums.length;
    }
}
