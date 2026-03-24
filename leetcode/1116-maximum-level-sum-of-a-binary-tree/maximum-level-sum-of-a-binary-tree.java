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
    public int maxLevelSum(TreeNode root) {
        
        int max_sum = root.val;

        if(root.left == null && root.right == null)return 1;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        int level = 1;
        int ansLevel = 1;
    
        while(!q.isEmpty()){
            int sum = 0;
            int size = q.size();

            for(int s=0;s<size;s++){
                TreeNode node = q.poll();

                sum += node.val;

                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }
            }


            if(max_sum < sum){
                max_sum = sum;
                ansLevel = level;
            }

            level++;
        }
        

        return ansLevel;
    }
}