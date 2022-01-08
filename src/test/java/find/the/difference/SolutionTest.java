package find.the.difference;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenABCDAndABCDEThenE() {
        Solution sol = new Solution();
        String s = "abcd";
        String t = "abcde";
        char expected = 'e';
        char rsl = sol.findTheDifference(s, t);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenEmptyAndYThenY() {
        Solution sol = new Solution();
        String s = "";
        String t = "y";
        char expected = 'y';
        char rsl = sol.findTheDifference(s, t);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenABCDAndABCADThenA() {
        Solution sol = new Solution();
        String s = "abcd";
        String t = "abcad";
        char expected = 'a';
        char rsl = sol.findTheDifference(s, t);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenABCDAndABCJDThenJ() {
        Solution sol = new Solution();
        String s = "abcd";
        String t = "abcjd";
        char expected = 'j';
        char rsl = sol.findTheDifference(s, t);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenABCDAndKABCDThenK() {
        Solution sol = new Solution();
        String s = "abcd";
        String t = "kabcd";
        char expected = 'k';
        char rsl = sol.findTheDifference(s, t);
        assertEquals(expected, rsl);
    }
}