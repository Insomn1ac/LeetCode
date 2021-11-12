package find.all.duplicates.in.an.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenInputIs43278231Then23() {
        Solution sol = new Solution();
        int[] input = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = List.of(2, 3);
        List<Integer> rsl = sol.findDuplicates(input);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenInputIs112Then1() {
        Solution sol = new Solution();
        int[] input = new int[] {1, 1, 2};
        List<Integer> expected = List.of(1);
        List<Integer> rsl = sol.findDuplicates(input);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenInputIs1ThenEmptyList() {
        Solution sol = new Solution();
        int[] input = new int[] {1};
        List<Integer> expected = List.of();
        List<Integer> rsl = sol.findDuplicates(input);
        assertEquals(expected, rsl);
    }
}