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
        int count = 1;
    public int goodNodes(TreeNode root) {
        

        if(root.left == null && root.right == null)return 1;

        count(root.left ,  root.val); 
        count(root.right ,  root.val);   

        return count;
    }

    public void count(TreeNode root ,  int max){
         if(root == null)return;

         if(root.val >= max){
            count++;
            max = root.val;
         }
         count(root.left  , max);
         count(root.right  , max);
    }
}