package binary.tree.postorder.traversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenRootIsNullThenEmptyList() {
        TreeNode root = new TreeNode();
        Solution sol = new Solution();
        List<Integer> expected = List.of(0);
        List<Integer> rsl = sol.postorderTraversal(root);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenTreeIs1Null23Then123() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Solution sol = new Solution();
        List<Integer> expected = List.of(3, 2, 1);
        List<Integer> rsl = sol.postorderTraversal(root);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenTreeIs1Then1() {
        TreeNode root = new TreeNode(1);
        Solution sol = new Solution();
        List<Integer> expected = List.of(1);
        List<Integer> rsl = sol.postorderTraversal(root);
        assertEquals(expected, rsl);
    }
}