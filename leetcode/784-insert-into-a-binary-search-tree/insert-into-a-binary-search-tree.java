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
    public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root == null){
                TreeNode newnode = new TreeNode(val);
                return newnode;
            }

            if(root.val < val){
                if(root.right == null){
                    TreeNode newnode = new TreeNode(val);
                    root.right = newnode;
                }
                else insertIntoBST(root.right , val);
            }

            if(root.val > val){
                if(root.left == null){
                    TreeNode newnode = new TreeNode(val);
                    root.left = newnode;
                }
                else insertIntoBST(root.left , val);
            }

            return root;
    }
}