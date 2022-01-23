package convert.sorted.array.to.bst;

import java.util.Objects;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBst(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBst(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int center = (start + end) / 2;
        TreeNode root = new TreeNode(nums[center]);
        root.left = sortedArrayToBst(nums, start, center - 1);
        root.right = sortedArrayToBst(nums, center + 1, end);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
