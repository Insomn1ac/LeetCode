package defanging.an.ip.address;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SolutionTest {

    @Test
    public void whenValidIP() {
        Solution rsl = new Solution();
        String input = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        String result = rsl.defangIPaddr(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenNotValidIP() {
        Solution rsl = new Solution();
        String input = "255,100,50,0";
        String expected = "255[.]100[.]50[.]0";
        String result = rsl.defangIPaddr(input);
        assertNotEquals(result, expected);
    }
}