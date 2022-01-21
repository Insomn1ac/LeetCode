package binary.tree.level.order.traversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void whenRootIsNullThenEmptyList() {
        TreeNode root = new TreeNode();
        Solution sol = new Solution();
        List<List<Integer>> expected = List.of(List.of(0));
        List<List<Integer>> rsl = sol.levelOrder(root);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenTreeIs3920NullNull157Then3920157() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null, null)));
        Solution sol = new Solution();
        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        List<List<Integer>> rsl = sol.levelOrder(root);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenTreeIs1Then1() {
        TreeNode root = new TreeNode(1);
        Solution sol = new Solution();
        List<List<Integer>> expected = List.of(List.of(1));
        List<List<Integer>> rsl = sol.levelOrder(root);
        assertEquals(expected, rsl);
    }
}