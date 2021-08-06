package valid.parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenOneTypeOfBracketsThenTrue() {
        String s = "()";
        assertTrue(Solution.isValid(s));
    }

    @Test
    public void whenAllTypeOfBracketsOpenAndClose() {
        String s = "()[]{}";
        assertTrue(Solution.isValid(s));
    }

    @Test
    public void whenAnotherBracketClosing() {
        String s = "(]";
        assertFalse(Solution.isValid(s));
    }

    @Test
    public void whenOnlyOneBracketClosing() {
        String s = "}";
        assertFalse(Solution.isValid(s));
    }
}