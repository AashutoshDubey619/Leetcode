class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return solve(root, 0, targetSum);
    }

    public boolean solve(TreeNode root, int sum, int targetSum){
        if(root == null) return false;

        if(root.left == null && root.right == null){
            return (sum + root.val) == targetSum;
        }

        return solve(root.left, sum + root.val, targetSum)
            || solve(root.right, sum + root.val, targetSum);
    }
}
