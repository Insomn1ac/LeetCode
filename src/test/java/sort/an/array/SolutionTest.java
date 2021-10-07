package sort.an.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenInputIs5231() {
        int[] expected = new int[] {1, 2, 3, 5};
        int[] input = new int[] {5, 2, 3, 1};
        assertThat(new Solution().sortArray(input), is(expected));
    }

    @Test
    public void whenInputIs511200() {
        int[] expected = new int[] {0, 0, 1, 1, 2, 5};
        int[] input = new int[] {5, 1, 1, 2, 0, 0};
        assertThat(new Solution().sortArray(input), is(expected));
    }
}