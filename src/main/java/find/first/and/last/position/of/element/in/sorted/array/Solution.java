package find.first.and.last.position.of.element.in.sorted.array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> rsl = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                rsl.add(i);
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                rsl.add(i);
                break;
            }
        }
        if (rsl.isEmpty()) {
            rsl.add(-1);
            rsl.add(-1);
        }
        return rsl.stream().mapToInt(i -> i).toArray();
    }
}