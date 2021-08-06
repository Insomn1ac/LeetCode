package build.array.from.permutation;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {
    @Test
    public void when021543Then012345() {
        Solution rsl = new Solution();
        int[] input = new int[] {0, 2, 1, 5, 4, 3};
        int[] expected = new int[] {0, 1, 2, 3, 4, 5};
        int[] result = rsl.buildArray(input);
        assertThat(result, is(expected));
    }

    @Test
    public void when501234Then450123() {
        Solution rsl = new Solution();
        int[] input = new int[] {5, 0, 1, 2, 3, 4};
        int[] expected = new int[] {4, 5, 0, 1, 2, 3};
        int[] result = rsl.buildArray(input);
        assertThat(result, is(expected));
    }
}