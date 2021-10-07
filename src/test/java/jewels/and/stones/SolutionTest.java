package jewels.and.stones;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenResultIs3() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int rsl = new Solution().numJewelsInStones(jewels, stones);
        int expected = 3;
        assertEquals(rsl, expected);
    }

    @Test
    public void whenResultIs0() {
        String jewels = "z";
        String stones = "ZZ";
        int rsl = new Solution().numJewelsInStones(jewels, stones);
        int expected = 0;
        assertEquals(rsl, expected);
    }
}