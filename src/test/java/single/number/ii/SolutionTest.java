package single.number.ii;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenArrayIs2232Then3() {
        Solution sol = new Solution();
        int[] array = new int[] {2, 2, 3, 2};
        int expected = 3;
        int rsl = sol.singleNumber(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrayIs01010199Then99() {
        Solution sol = new Solution();
        int[] array = new int[] {0, 1, 0, 1, 0, 1, 99};
        int expected = 99;
        int rsl = sol.singleNumber(array);
        assertThat(rsl, is(expected));
    }
}