package reverse.integer;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {
    @Test
    public void whenInput123ThenOutput321() {
        Solution rsl = new Solution();
        int input = 123;
        int expected = 321;
        int result = rsl.reverse(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenInputMinus123ThenOutputMinus321() {
        Solution rsl = new Solution();
        int input = -123;
        int expected = -321;
        int result = rsl.reverse(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenInput120ThenOutput21() {
        Solution rsl = new Solution();
        int input = 120;
        int expected = 21;
        int result = rsl.reverse(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenInput0ThenOutput0() {
        Solution rsl = new Solution();
        int input = 0;
        int expected = 0;
        int result = rsl.reverse(input);
        assertThat(result, is(expected));
    }
}