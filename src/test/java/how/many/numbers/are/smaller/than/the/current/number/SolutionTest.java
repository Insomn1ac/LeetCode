package how.many.numbers.are.smaller.than.the.current.number;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenArrayOf5Numbers() {
        Solution sol = new Solution();
        int[] array = new int[] {8, 1, 2, 2, 3};
        int[] expected = new int[] {4, 0, 1, 1, 3};
        int[] result = sol.smallerNumbersThanCurrent(array);
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayOf4Numbers() {
        Solution sol = new Solution();
        int[] array = new int[] {6, 5, 4, 8};
        int[] expected = new int[] {2, 1, 0, 3};
        int[] result = sol.smallerNumbersThanCurrent(array);
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayOfEqualNumbers() {
        Solution sol = new Solution();
        int[] array = new int[] {7, 7, 7, 7};
        int[] expected = new int[] {0, 0, 0, 0};
        int[] result = sol.smallerNumbersThanCurrent(array);
        assertThat(result, is(expected));
    }
}