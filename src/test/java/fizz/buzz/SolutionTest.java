package fizz.buzz;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void when3Then12Fizz() {
        Solution sol = new Solution();
        int n = 3;
        List<String> expected = List.of("1", "2", "Fizz");
        List<String> rsl = sol.fizzBuzz(n);
        assertEquals(expected, rsl);
    }

    @Test
    public void when5Then12Fizz4Buzz() {
        Solution sol = new Solution();
        int n = 5;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        List<String> rsl = sol.fizzBuzz(n);
        assertEquals(expected, rsl);
    }

    @Test
    public void when15ThenSeeCodeBelow() {
        Solution sol = new Solution();
        int n = 15;
        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        );
        List<String> rsl = sol.fizzBuzz(n);
        assertEquals(expected, rsl);
    }
}