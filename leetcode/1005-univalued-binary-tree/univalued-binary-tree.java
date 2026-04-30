class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return checkUni(root, root.val);
    }

    public boolean checkUni(TreeNode root, int val) {
        if (root == null) return true;

        if (root.val != val) return false;

        return checkUni(root.left, val) && checkUni(root.right, val);
    }
}