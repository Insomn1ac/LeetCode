package transpose.matrix;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenMatrixIsSquare() {
        Solution sol = new Solution();
        int[][] input = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][] {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] result = sol.transpose(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMatrixIsNotSquare() {
        Solution sol = new Solution();
        int[][] input = new int[][] {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = new int[][] {{1, 4}, {2, 5}, {3, 6}};
        int[][] result = sol.transpose(input);
        assertThat(result, is(expected));
    }
}