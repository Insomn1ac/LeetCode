package roman.to.integer;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {
    @Test
    public void whenInputIIIThenOutput3() {
        Solution rsl = new Solution();
        String input = "III";
        int expected = 3;
        int result = rsl.romanToInt(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenInputIVThenOutput4() {
        Solution rsl = new Solution();
        String input = "IV";
        int expected = 4;
        int result = rsl.romanToInt(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenInputIXThenOutput9() {
        Solution rsl = new Solution();
        String input = "IX";
        int expected = 9;
        int result = rsl.romanToInt(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenInputLVIIIThenOutput58() {
        Solution rsl = new Solution();
        String input = "LVIII";
        int expected = 58;
        int result = rsl.romanToInt(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenInputMCMXCIVThenOutput1994() {
        Solution rsl = new Solution();
        String input = "MCMXCIV";
        int expected = 1994;
        int result = rsl.romanToInt(input);
        assertThat(result, is(expected));
    }
}