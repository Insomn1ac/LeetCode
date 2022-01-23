package convert.sorted.array.to.bst;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenMinus10Minus3059Then0Minus105NullMinus3Null9() {
        Solution sol = new Solution();
        int[] input = new int[] {-10, -3, 0, 5, 9};
        TreeNode expected = new TreeNode(0,
                new TreeNode(-10, null, new TreeNode(-3)),
                new TreeNode(5, null, new TreeNode(9)));
        TreeNode rsl = sol.sortedArrayToBST(input);
        assertEquals(expected, rsl);
    }

    @Test
    public void when13Then13() {
        Solution sol = new Solution();
        int[] input = new int[] {1, 3};
        TreeNode expected = new TreeNode(1,
                null, new TreeNode(3));
        TreeNode rsl = sol.sortedArrayToBST(input);
        assertEquals(expected, rsl);
    }
}