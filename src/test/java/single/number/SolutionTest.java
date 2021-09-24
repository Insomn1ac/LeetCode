package single.number;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenArrayIs221Then1() {
        Solution sol = new Solution();
        int[] array = new int[] {2, 2, 1};
        int expected = 1;
        int rsl = sol.singleNumber(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrayIs41212Then4() {
        Solution sol = new Solution();
        int[] array = new int[] {4, 1, 2, 1, 2};
        int expected = 4;
        int rsl = sol.singleNumber(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrayIs1Then1() {
        Solution sol = new Solution();
        int[] array = new int[] {1};
        int expected = 1;
        int rsl = sol.singleNumber(array);
        assertThat(rsl, is(expected));
    }
}