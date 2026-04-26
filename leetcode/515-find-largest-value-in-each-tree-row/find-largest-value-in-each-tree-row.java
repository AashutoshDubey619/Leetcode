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
    public List<Integer> largestValues(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null)return list;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(q.size() > 0){
            int size = q.size();
            int largest = Integer.MIN_VALUE;

            for(int s=0;s<size;s++){
                TreeNode node = q.poll();

                largest = Math.max(largest , node.val);

                if(node.left != null)q.add(node.left); 
                if(node.right != null)q.add(node.right); 
            }
            list.add(largest);
        }
        return list;
    }
}