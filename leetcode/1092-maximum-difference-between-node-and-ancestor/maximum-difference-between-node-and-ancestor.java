/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max_diff = Integer.MIN_VALUE;

    public int maxAncestorDiff(TreeNode root) {
        
        diff(root , root.val);
        if(root.left != null)maxAncestorDiff(root.left);
        if(root.right != null)maxAncestorDiff(root.right);

        return max_diff;
    }

    public void diff(TreeNode root , int val){
        if(root == null)return;

        max_diff = Math.max(max_diff , Math.abs(val - root.val));

        diff(root.left ,val);
        diff(root.right ,val);
    }
}