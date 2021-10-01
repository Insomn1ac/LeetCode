package majority.element;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenMajorityIs3() {
        int[] input = new int[] {3, 2, 3};
        int rsl = new Solution().majorityElement(input);
        int expected = 3;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenMajorityIs2() {
        int[] input = new int[] {2, 2, 1, 1, 1, 2, 2};
        int rsl = new Solution().majorityElement(input);
        int expected = 2;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrayLengthIs1() {
        int[] input = new int[] {1};
        int rsl = new Solution().majorityElement(input);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenMajorityIs7() {
        int[] input = new int[] {8, 8, 7, 7, 7};
        int rsl = new Solution().majorityElement(input);
        int expected = 7;
        assertThat(rsl, is(expected));
    }
}