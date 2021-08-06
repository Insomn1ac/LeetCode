package shuffle.array;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int[] arr = new int[2 * n];
        int count = 0;
        for (int i = 0; i < nums.length - n; i++) {
            arr[count] = nums[i];
            arr[count + 1] = nums[i + n];
            count += 2;
        }
        return arr;
    }
}
