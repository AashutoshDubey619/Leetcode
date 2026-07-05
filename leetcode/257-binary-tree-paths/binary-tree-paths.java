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
        List<String> res = new ArrayList<>();

        paths(root , new StringBuilder() , res);

        return res;
    }

    public void paths(TreeNode root , StringBuilder sb , List<String> res ){
        if(root == null)return;
        else if(root.left == null && root.right == null){
            int len = sb.length();
            sb.append(root.val);
            res.add(sb.toString());
            sb.setLength(len);
            return;
        }

        int len = sb.length();
        sb.append(root.val+"->");
        paths(root.left , sb , res);
        paths(root.right , sb , res);
        sb.setLength(len);
    }
}