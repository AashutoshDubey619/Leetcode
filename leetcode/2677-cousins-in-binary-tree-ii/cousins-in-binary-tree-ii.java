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
    public TreeNode replaceValueInTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        root.val = 0;

        while(!q.isEmpty()){
            int size = q.size();

            HashMap<TreeNode , Integer> map = new HashMap<>(); 

            int total_sum = 0;

            for(int s=0;s<size;s++){
                TreeNode node = q.poll();
                int sum = 0;

                if(node.left != null){
                    q.add(node.left);
                    sum += node.left.val;
                }
                if(node.right != null){
                    q.add(node.right);
                    sum += node.right.val;
                }

                total_sum += sum;
                map.put(node , sum);
            }
            
            for(TreeNode parent : map.keySet()){
                if(parent.left != null){
                    parent.left.val = total_sum - map.get(parent);
                }
                if(parent.right != null){
                    parent.right.val = total_sum - map.get(parent);
                }
            }
        }

        return root;
    }
}