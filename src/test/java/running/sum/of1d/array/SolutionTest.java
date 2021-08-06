package running.sum.of1d.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {
    @Test
    public void when1234Then13610() {
        Solution rsl = new Solution();
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {1, 3, 6, 10};
        int[] result = rsl.runningSum(input);
        assertThat(result, is(expected));
    }

    @Test
    public void when1Then1() {
        Solution rsl = new Solution();
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = rsl.runningSum(input);
        assertThat(result, is(expected));
    }

    @Test
    public void when312101Then3461617() {
        Solution rsl = new Solution();
        int[] input = new int[] {3, 1, 2, 10, 1};
        int[] expected = new int[] {3, 4, 6, 16, 17};
        int[] result = rsl.runningSum(input);
        assertThat(result, is(expected));
    }
}