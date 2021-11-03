package print.words.vertically;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenHOWAREYOUThenHAYOROWEU() {
        Solution sol = new Solution();
        String input = "HOW ARE YOU";
        List<String> expected = List.of("HAY", "ORO", "WEU");
        List<String> rsl = sol.printVertically(input);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenTOBEORNOTTOBEThenTBONTBOEROOET() {
        Solution sol = new Solution();
        String input = "TO BE OR NOT TO BE";
        List<String> expected = List.of("TBONTB", "OEROOE", "   T");
        List<String> rsl = sol.printVertically(input);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenAABBBCDDDDEEEEEF() {
        Solution sol = new Solution();
        String input = "AA BBB C DDDD EEEEE F";
        List<String> expected = List.of("ABCDEF", "AB DE", " B DE", "   DE", "    E");
        List<String> rsl = sol.printVertically(input);
        assertEquals(expected, rsl);
    }
}