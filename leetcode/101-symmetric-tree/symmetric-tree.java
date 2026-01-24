class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkSym(root.left, root.right);
    }

    public boolean checkSym(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return checkSym(root1.left, root2.right) &&
               checkSym(root1.right, root2.left);
    }
}
