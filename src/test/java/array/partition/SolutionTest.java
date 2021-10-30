package array.partition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void when1432Then4() {
        Solution sol = new Solution();
        int[] input = new int[] {1, 4, 3, 2};
        int expected = 4;
        int rsl = sol.arrayPairSum(input);
        assertEquals(expected, rsl);
    }

    @Test
    public void when626512Then9() {
        Solution sol = new Solution();
        int[] input = new int[] {6, 2, 6, 5, 1, 2};
        int expected = 9;
        int rsl = sol.arrayPairSum(input);
        assertEquals(expected, rsl);
    }
}