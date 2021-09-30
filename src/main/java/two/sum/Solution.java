package two.sum;

import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] rsl = new int[2];
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            Integer secIndex = values.get(val);
            if (secIndex != null && secIndex != i) {
                rsl[0] = i;
                rsl[1] = secIndex;
                return rsl;
            }
        }
        return rsl;
    }

    public static int[] twoSumAnother(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        int[] rsl = new int[2];
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.contains(target - nums[i])) {
                rsl[1] = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target - nums[rsl[1]] && rsl[1] != i) {
                rsl[0] = i;
            }
        }
        return rsl;
    }
}