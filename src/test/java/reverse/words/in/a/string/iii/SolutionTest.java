package reverse.words.in.a.string.iii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenInputHas4Words() {
        Solution sol = new Solution();
        String input = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        String rsl = sol.reverseWords(input);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenInputHas2Words() {
        Solution sol = new Solution();
        String input = "God Ding";
        String expected = "doG gniD";
        String rsl = sol.reverseWords(input);
        assertEquals(expected, rsl);
    }
}