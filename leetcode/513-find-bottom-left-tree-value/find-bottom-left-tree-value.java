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
    public int findBottomLeftValue(TreeNode root) {
        
        if(root.left == null && root.right == null)return root.val;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int val = -1;

        while(!q.isEmpty()){
            int size = q.size();

            for(int s=0;s<size;s++){
                TreeNode node = q.poll();
                if(s==0)val = node.val;
                
                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }
            }
        }

        return val;
    }
}