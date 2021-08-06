package palindrome.number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenNumberIs121ThenTrue() {
        Solution rsl = new Solution();
        int input = 121;
        assertTrue(rsl.isPalindrome(input));
    }

    @Test
    public void whenNumberIsMinus121ThenFalse() {
        Solution rsl = new Solution();
        int input = -121;
        assertFalse(rsl.isPalindrome(input));
    }

    @Test
    public void whenNumberIs10ThenFalse() {
        Solution rsl = new Solution();
        int input = 10;
        assertFalse(rsl.isPalindrome(input));
    }

    @Test
    public void whenNumberIsMinus101ThenFalse() {
        Solution rsl = new Solution();
        int input = -101;
        assertFalse(rsl.isPalindrome(input));
    }
}