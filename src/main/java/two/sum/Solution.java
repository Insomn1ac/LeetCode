package two.sum;

import java.util.HashMap;
import java.util.Map;

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
}