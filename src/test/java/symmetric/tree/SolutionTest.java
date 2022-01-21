package symmetric.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenRootIs1223443ThenTrue() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2, new Solution.TreeNode(3), new Solution.TreeNode(4)),
                new Solution.TreeNode(2, new Solution.TreeNode(4), new Solution.TreeNode(3)));
        Solution sol = new Solution();
        assertTrue(sol.isSymmetric(root));
    }

    @Test
    public void whenTreeIs122Null3Null3ThenFalse() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2, null, new Solution.TreeNode(3)),
                new Solution.TreeNode(2, null, new Solution.TreeNode(3)));
        Solution sol = new Solution();
        assertFalse(sol.isSymmetric(root));
    }
}