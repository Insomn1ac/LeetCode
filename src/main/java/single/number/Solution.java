package single.number;

class Solution {
    public int singleNumber(int[] nums) {
        int rsl = 0;
        for (int num : nums) {
            rsl ^= num;
        }
        return rsl;
    }
}
