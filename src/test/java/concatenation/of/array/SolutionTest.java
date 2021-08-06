package concatenation.of.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {
    @Test
    public void when121Then121121() {
        Solution rsl = new Solution();
        int[] input = new int[] {1, 2, 1};
        int[] expected = new int[] {1, 2, 1, 1, 2, 1};
        int[] result = rsl.getConcatenation(input);
        assertThat(result, is(expected));
    }

    @Test
    public void when1321Then13211321() {
        Solution rsl = new Solution();
        int[] input = new int[] {1, 3, 2, 1};
        int[] expected = new int[] {1, 3, 2, 1, 1, 3, 2, 1};
        int[] result = rsl.getConcatenation(input);
        assertThat(result, is(expected));
    }
}