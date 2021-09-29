package find.first.and.last.position.of.element.in.sorted.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenTargetIs8() {
        Solution sol = new Solution();
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = new int[] {3, 4};
        int[] rsl = sol.searchRange(nums, target);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenTargetIs6() {
        Solution sol = new Solution();
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = new int[] {-1, -1};
        int[] rsl = sol.searchRange(nums, target);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenTargetIs0() {
        Solution sol = new Solution();
        int[] nums = new int[] {};
        int target = 0;
        int[] expected = new int[] {-1, -1};
        int[] rsl = sol.searchRange(nums, target);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenTargetIs1() {
        Solution sol = new Solution();
        int[] nums = new int[] {1};
        int target = 1;
        int[] expected = new int[] {0, 0};
        int[] rsl = sol.searchRange(nums, target);
        assertThat(rsl, is(expected));
    }
}