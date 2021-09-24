package how.many.numbers.are.smaller.than.the.current.number;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> rsl = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            for (int i : nums) {
                if (i < num) {
                    count++;
                }
            }
            rsl.add(count);
            count = 0;
        }
        int[] array = new int[rsl.size()];
        for (int k = 0; k < array.length; k++) {
            array[k] = rsl.get(k);
        }
        return array;
    }
}
