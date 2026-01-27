/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return root;

        if(bothExist(root.left , p , q)){
            return lowestCommonAncestor(root.left , p , q);
        } 
        else if(bothExist(root.right , p , q)){
           return lowestCommonAncestor(root.right , p , q);
        } 

        return root;
    }


        public boolean bothExist(TreeNode root, TreeNode p, TreeNode q) {
            return find(root, p) && find(root, q);
        }

        public boolean find(TreeNode root, TreeNode target) {
            if (root == null) return false;
            if (root == target) return true;
            return find(root.left, target) || find(root.right, target);
        }

}