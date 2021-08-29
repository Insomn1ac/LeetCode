package longest.common.prefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenCommonPrefixExists() {
        String[] str = new String[] {"flower", "flow", "flight"};
        String expected = "fl";
        String result = Solution.longestCommonPrefix(str);
        assertEquals(expected, result);
    }

    @Test
    public void whenCommonPrefixDoesNotExists() {
        String[] str = new String[] {"dog", "racecar", "car"};
        String expected = "";
        String result = Solution.longestCommonPrefix(str);
        assertEquals(expected, result);
    }
}