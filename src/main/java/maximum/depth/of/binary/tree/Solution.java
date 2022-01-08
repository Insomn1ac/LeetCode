package maximum.depth.of.binary.tree;

class Solution {

    public static class TreeNode {
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
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int countLeft = maxDepth(root.left);
        int countRight = maxDepth(root.right);
        if (countLeft > countRight) {
            return countLeft + 1;
        } else {
            return countRight + 1;
        }
    }
}

