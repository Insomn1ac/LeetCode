package two.sum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenTargetIsPositive() {
        int[] input = new int[] {2, 7, 11, 15};
        int[] expected = new int[] {0, 1};
        assertArrayEquals(expected, Solution.twoSum(input, 9));
    }

    @Test
    public void whenAnotherTargetIsPositive() {
        int[] input = new int[] {3, 2, 4};
        int[] expected = new int[] {1, 2};
        assertArrayEquals(expected, Solution.twoSum(input, 6));
    }

    @Test
    public void whenNumbersEqual() {
        int[] input = new int[] {3, 3};
        int[] expected = new int[] {0, 1};
        assertArrayEquals(expected, Solution.twoSum(input, 6));
    }
}