package shuffle.string;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {
    @Test
    public void whenOutputLeetcode() {
        Solution rsl = new Solution();
        String input = "codeleet";
        int[] indices = new int[] {4, 5, 6, 7, 0, 2, 1, 3};
        String expected = "leetcode";
        String result = rsl.restoreString(input, indices);
        assertThat(result, is(expected));
    }

    @Test
    public void whenOutputAbc() {
        Solution rsl = new Solution();
        String input = "abc";
        int[] indices = new int[] {0, 1, 2};
        String expected = "abc";
        String result = rsl.restoreString(input, indices);
        assertThat(result, is(expected));
    }

    @Test
    public void whenOutputNihao() {
        Solution rsl = new Solution();
        String input = "aiohn";
        int[] indices = new int[] {3, 1, 4, 2, 0};
        String expected = "nihao";
        String result = rsl.restoreString(input, indices);
        assertThat(result, is(expected));
    }

    @Test
    public void whenOutputArigatou() {
        Solution rsl = new Solution();
        String input = "aaiougrt";
        int[] indices = new int[] {4, 0, 2, 6, 7, 3, 1, 5};
        String expected = "arigatou";
        String result = rsl.restoreString(input, indices);
        assertThat(result, is(expected));
    }

    @Test
    public void whenOutputRat() {
        Solution rsl = new Solution();
        String input = "art";
        int[] indices = new int[] {1, 0, 2};
        String expected = "rat";
        String result = rsl.restoreString(input, indices);
        assertThat(result, is(expected));
    }
}