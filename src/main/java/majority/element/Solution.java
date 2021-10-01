package majority.element;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }

    public int majorityElementBruteSolution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}