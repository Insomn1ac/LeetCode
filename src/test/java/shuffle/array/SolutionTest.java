package shuffle.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {
    @Test
    public void when251347Then235417() {
        Solution rsl = new Solution();
        int[] input = new int[] {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] expected = new int[] {2, 3, 5, 4, 1, 7};
        int[] result = rsl.shuffle(input, n);
        assertThat(result, is(expected));
    }

    @Test
    public void when12344321Then14233241() {
        Solution rsl = new Solution();
        int[] input = new int[] {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] expected = new int[] {1, 4, 2, 3, 3, 2, 4, 1};
        int[] result = rsl.shuffle(input, n);
        assertThat(result, is(expected));
    }

    @Test
    public void when1122Then1212() {
        Solution rsl = new Solution();
        int[] input = new int[] {1, 1, 2, 2};
        int n = 2;
        int[] expected = new int[] {1, 2, 1, 2};
        int[] result = rsl.shuffle(input, n);
        assertThat(result, is(expected));
    }
}