package longest.common.subsequence;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void whenABCDEAndACEThen3() {
        String first = "abcde";
        String second = "ace";
        int expected = 3;
        int rsl = new Solution().longestCommonSubsequence(first, second);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenABCAndABCThen3() {
        String first = "abc";
        String second = "abc";
        int expected = 3;
        int rsl = new Solution().longestCommonSubsequence(first, second);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenABCAndDEFThen0() {
        String first = "abc";
        String second = "def";
        int expected = 0;
        int rsl = new Solution().longestCommonSubsequence(first, second);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenEZUPKRAndUBMRAPGThen2() {
        String first = "ezupkr";
        String second = "ubmrapg";
        int expected = 2;
        int rsl = new Solution().longestCommonSubsequence(first, second);
        assertThat(rsl, is(expected));
    }
}