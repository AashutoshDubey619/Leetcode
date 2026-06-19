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
    public int rob(TreeNode root) {
       
       HashMap<TreeNode , Integer> dp = new HashMap<>();

       return amount(root ,dp);
    }

    public int amount(TreeNode root ,HashMap<TreeNode , Integer> dp){
       if(root == null)return 0;
       if(root.left == null && root.right == null)return root.val;

       int pick = 0 , skip = -1;

       if(dp.containsKey(root))return dp.get(root);

       skip = amount(root.left ,dp ) + amount(root.right , dp);

       pick += root.val;
       if(root.left != null && root.left.left != null)pick += amount(root.left.left ,dp);
       if(root.left != null && root.left.right != null)pick += amount(root.left.right ,dp);
       if(root.right != null && root.right.right != null)pick += amount(root.right.right ,dp);
       if(root.right != null && root.right.left != null)pick += amount(root.right.left ,dp);

       int ans = Math.max(skip, pick);
       dp.put(root, ans);
       return ans;
    }
}