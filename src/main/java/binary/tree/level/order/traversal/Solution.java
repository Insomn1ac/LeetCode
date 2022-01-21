package binary.tree.level.order.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rsl = new ArrayList<>();
        if (root == null) {
            return rsl;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int sizeOfQueue = queue.size();
            List<Integer> treeRow = new ArrayList<>();
            for (int i = 0; i < sizeOfQueue; i++) {
                TreeNode next = queue.poll();
                if (next != null) {
                    treeRow.add(next.val);
                }
                if (next != null && next.left != null) {
                    queue.offer(next.left);
                }
                if (next != null && next.right != null) {
                    queue.offer(next.right);
                }
            }
            rsl.add(treeRow);
        }
        return rsl;
    }
}
