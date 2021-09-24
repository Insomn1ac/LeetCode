package length.of.last.word;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenLastWordLengthIs5() {
        Solution sol = new Solution();
        String s = "Hello World";
        int expected = 5;
        int result = sol.lengthOfLastWord(s);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLastWordLengthIs4() {
        Solution sol = new Solution();
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        int result = sol.lengthOfLastWord(s);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLastWordLengthIs6() {
        Solution sol = new Solution();
        String s = "luffy is still joyboy";
        int expected = 6;
        int result = sol.lengthOfLastWord(s);
        assertThat(result, is(expected));
    }
}