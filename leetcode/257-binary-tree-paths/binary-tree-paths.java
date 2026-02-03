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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();

        if(root == null) return res;
        if(root.left == null && root.right == null){
            res.add(String.valueOf(root.val));
            return res;
        }
        
        String s = root.val + "->";
        
        paths(root.left , res , s);
        paths(root.right , res , s);

        return res;
    }


    public void paths(TreeNode root , ArrayList<String> res , String s){

        if(root == null) return;
        if(root.left == null && root.right == null){
            res.add(s + String.valueOf(root.val));
        }
        
        paths(root.left , res , s + root.val + "->");
        paths(root.right , res , s + root.val + "->");
    }
}