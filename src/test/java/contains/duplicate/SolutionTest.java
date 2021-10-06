package contains.duplicate;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenArrayLengthIs4AndContains() {
        Solution sol = new Solution();
        int[] input = new int[] {1, 2, 3, 1};
        assertTrue(sol.containsDuplicate(input));
    }

    @Test
    public void whenArrayLengthIs4AndNotContains() {
        Solution sol = new Solution();
        int[] input = new int[] {1, 2, 3, 4};
        assertFalse(sol.containsDuplicate(input));
    }

    @Test
    public void whenArrayLengthIs10AndContains() {
        Solution sol = new Solution();
        int[] input = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(sol.containsDuplicate(input));
    }
}