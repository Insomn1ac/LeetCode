package median.of.two.sorted.arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int j = 0;
        int k = 0;
        int[] rsl = new int[nums1.length + nums2.length];
        for (int i = 0; i < rsl.length; i++) {
            if (j < nums1.length && k < nums2.length) {
                if (nums1[j] > nums2[k]) {
                    rsl[i] = nums2[k++];
                } else {
                    rsl[i] = nums1[j++];
                }
            } else if (k < nums2.length) {
                rsl[i] = nums2[k++];
            } else {
                rsl[i] = nums1[j++];
            }
        }
        if (rsl.length % 2 != 0) {
            return rsl[rsl.length / 2];
        } else {
            return (double) (rsl[(rsl.length / 2 - 1)] + rsl[rsl.length / 2]) / 2;
        }
    }
}
