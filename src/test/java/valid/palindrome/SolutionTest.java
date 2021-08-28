package valid.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(Solution.isPalindrome(s));
    }

    @Test
    public void whenNotAPalindrome() {
        String s = "race a car";
        assertFalse(Solution.isPalindrome(s));
    }
}