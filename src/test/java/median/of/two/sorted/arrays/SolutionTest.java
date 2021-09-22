package median.of.two.sorted.arrays;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void when13And2ThenResultIs2() {
        Solution solution = new Solution();
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        double rsl = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 2.0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when12And34ThenResultIs2Point5() {
        Solution solution = new Solution();
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {3, 4};
        double rsl = solution.findMedianSortedArrays(nums1, nums2);
        double expected = 2.5;
        assertThat(rsl, is(expected));
    }
}